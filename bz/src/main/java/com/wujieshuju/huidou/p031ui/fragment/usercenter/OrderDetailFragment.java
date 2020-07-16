package com.wujieshuju.huidou.p031ui.fragment.usercenter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.wujieshuju.huidou.C1068R;
import com.wujieshuju.huidou.Const;
import com.wujieshuju.huidou.model.OrderDetailResponse;
import com.wujieshuju.huidou.network.BaseResponse;
import com.wujieshuju.huidou.network.OkHttpClientUtil;
import com.wujieshuju.huidou.p031ui.base.BaseFragment;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.OrderDetailFragment */
public class OrderDetailFragment extends BaseFragment {
    /* access modifiers changed from: private */
    public boolean hasMore = true;
    /* access modifiers changed from: private */
    public boolean isLoading = false;
    /* access modifiers changed from: private */
    public ArrayList<OrderDetailResponse.Item> items = new ArrayList<>();
    /* access modifiers changed from: private */
    public OrderDetailRecyclerViewerAdapter mAdapter;
    private RecyclerView orderDetailRecyclerView;

    /* access modifiers changed from: protected */
    public String getActionBarTitle() {
        return "我的订单";
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return C1068R.layout.fragment_order_detail;
    }

    public void onClick(View view) {
    }

    /* access modifiers changed from: protected */
    public void initView() {
        this.orderDetailRecyclerView = (RecyclerView) findViewById(C1068R.C1071id.orderDetailRecyclerView);
    }

    /* access modifiers changed from: protected */
    public void initListener() {
        this.orderDetailRecyclerView.addOnScrollListener(new OnLoadMoreListener() {
            /* access modifiers changed from: protected */
            public void loadMore() {
                OrderDetailFragment.this.loadMoreData();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void initData() {
        loadMoreData();
    }

    /* access modifiers changed from: protected */
    public void setupView() {
        this.orderDetailRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        OrderDetailRecyclerViewerAdapter orderDetailRecyclerViewerAdapter = new OrderDetailRecyclerViewerAdapter(this.items);
        this.mAdapter = orderDetailRecyclerViewerAdapter;
        this.orderDetailRecyclerView.setAdapter(orderDetailRecyclerViewerAdapter);
    }

    /* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.OrderDetailFragment$OrderDetailRecyclerViewerAdapter */
    public class OrderDetailRecyclerViewerAdapter extends RecyclerView.Adapter<ItemViewHolder> {
        private OrderDetailResponse.Item item;
        private ArrayList<OrderDetailResponse.Item> mItems;

        public OrderDetailRecyclerViewerAdapter(ArrayList<OrderDetailResponse.Item> arrayList) {
            this.mItems = arrayList;
        }

        public void updateData(ArrayList<OrderDetailResponse.Item> arrayList) {
            this.mItems = arrayList;
            notifyDataSetChanged();
        }

        public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1068R.layout.order_detail_recycler_view_item, viewGroup, false));
        }

        public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
            OrderDetailResponse.Item item2 = this.mItems.get(i);
            if (item2 != null) {
                itemViewHolder.textViewOrderAmount.setText(item2.pay_money);
                itemViewHolder.textViewOrderAliPayID.setText(item2.order_no);
                itemViewHolder.textViewOrderCreateTime.setText(item2.created);
            }
        }

        public int getItemCount() {
            ArrayList<OrderDetailResponse.Item> arrayList = this.mItems;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
    }

    /* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.OrderDetailFragment$ItemViewHolder */
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public Button payButton;
        public TextView textViewOrderAliPayID;
        public TextView textViewOrderAmount;
        public TextView textViewOrderCreateTime;

        public ItemViewHolder(View view) {
            super(view);
            this.textViewOrderAmount = (TextView) view.findViewById(C1068R.C1071id.textViewOrderAmount);
            this.textViewOrderAliPayID = (TextView) view.findViewById(C1068R.C1071id.textViewOrderAliPayID);
            this.textViewOrderCreateTime = (TextView) view.findViewById(C1068R.C1071id.textViewOrderCreateTime);
        }
    }

    public void loadMoreData() {
        if (this.hasMore && !this.isLoading) {
            this.isLoading = true;
            final int ceil = (int) (Math.ceil((double) (((float) this.items.size()) / 10.0f)) + 1.0d);
            HashMap hashMap = new HashMap();
            hashMap.put("is_pay", "10");
            hashMap.put("p", String.valueOf(ceil));
            hashMap.put("n", "10");
            hashMap.put("product_id", "4");
            OkHttpClientUtil.getInstance().post(Const.URL_GET_USER_ORDER, hashMap, OrderDetailResponse.class, new OkHttpClientUtil.ResponseCallback() {
                public <T extends BaseResponse> void onComplete(T t) {
                    boolean unused = OrderDetailFragment.this.isLoading = false;
                    if (t == null || t.status != 1) {
                        Toast.makeText(OrderDetailFragment.this.getContext(), t.msg, 0).show();
                        return;
                    }
                    ArrayList arrayList = (ArrayList) t.data;
                    if (arrayList == null || arrayList.size() <= 0) {
                        boolean unused2 = OrderDetailFragment.this.hasMore = false;
                        Toast.makeText(OrderDetailFragment.this.getContext(), "没有更多了", 0).show();
                        return;
                    }
                    if (ceil == 1) {
                        OrderDetailFragment.this.items.clear();
                    }
                    OrderDetailFragment.this.items.addAll(arrayList);
                    Log.i(Const.TAG, "result count -> " + OrderDetailFragment.this.items.size());
                    OrderDetailFragment.this.mAdapter.updateData(OrderDetailFragment.this.items);
                }
            });
        }
    }

    /* renamed from: com.wujieshuju.huidou.ui.fragment.usercenter.OrderDetailFragment$OnLoadMoreListener */
    class OnLoadMoreListener extends RecyclerView.OnScrollListener {
        /* access modifiers changed from: protected */
        public void loadMore() {
        }

        OnLoadMoreListener() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int itemCount = recyclerView.getAdapter().getItemCount();
            int findLastVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            int childCount = recyclerView.getChildCount();
            if (i == 0 && findLastVisibleItemPosition == itemCount - 1 && childCount > 0) {
                loadMore();
            }
        }
    }
}

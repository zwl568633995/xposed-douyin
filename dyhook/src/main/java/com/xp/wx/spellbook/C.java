package com.xp.wx.spellbook;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001b\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u001b\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0007R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0007R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0007R\u001b\u0010X\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030Y0\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0007R\u001b\u0010^\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030_0\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0007R\u001b\u0010a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\u0007R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\u0007R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0007R\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0007R\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\u0007R\u001f\u0010p\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030q0\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\u0007R\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\u0007R\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020w0\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\u0007R\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010\u0007R\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020}0\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u0007R\u0019\u0010\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R \u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00010\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R!\u0010\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00010\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R!\u0010\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00010\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\u0007R\u001a\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010\u0007R\u001a\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010\u0007R\u001a\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010\u0007¨\u0006§\u0001"}, d2 = {"Lcom/xp/wx/spellbook/C;", "", "()V", "Activity", "Ljava/lang/Class;", "Landroid/app/Activity;", "getActivity", "()Ljava/lang/Class;", "AdapterView", "Landroid/widget/AdapterView;", "getAdapterView", "AdapterView_OnItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "getAdapterView_OnItemClickListener", "ArrayList", "Ljava/util/ArrayList;", "getArrayList", "AttributeSet", "Landroid/util/AttributeSet;", "getAttributeSet", "BaseAdapter", "Landroid/widget/BaseAdapter;", "getBaseAdapter", "Bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "Boolean", "", "getBoolean", "Bundle", "Landroid/os/Bundle;", "getBundle", "Button", "Landroid/widget/Button;", "getButton", "ByteArray", "", "getByteArray", "Clazz", "getClazz", "Configuration", "Landroid/content/res/Configuration;", "getConfiguration", "ContentValues", "Landroid/content/ContentValues;", "getContentValues", "Context", "Landroid/content/Context;", "getContext", "ContextMenu", "Landroid/view/ContextMenu;", "getContextMenu", "ContextMenuInfo", "Landroid/view/ContextMenu$ContextMenuInfo;", "getContextMenuInfo", "Cursor", "Landroid/database/Cursor;", "getCursor", "File", "Ljava/io/File;", "getFile", "FileInputStream", "Ljava/io/FileInputStream;", "getFileInputStream", "FileOutputStream", "Ljava/io/FileOutputStream;", "getFileOutputStream", "Float", "", "getFloat", "HeaderViewListAdapter", "Landroid/widget/HeaderViewListAdapter;", "getHeaderViewListAdapter", "InputStream", "Ljava/io/InputStream;", "getInputStream", "Int", "", "getInt", "IntArray", "", "getIntArray", "Integer", "Ljava/lang/Integer;", "getInteger", "Intent", "Landroid/content/Intent;", "getIntent", "Iterator", "Ljava/util/Iterator;", "getIterator", "KeyEvent", "Landroid/view/KeyEvent;", "getKeyEvent", "LinkedList", "Ljava/util/LinkedList;", "getLinkedList", "List", "", "getList", "ListAdapter", "Landroid/widget/ListAdapter;", "getListAdapter", "ListView", "Landroid/widget/ListView;", "getListView", "Long", "", "getLong", "Looper", "Landroid/os/Looper;", "getLooper", "Map", "", "getMap", "Menu", "Landroid/view/Menu;", "getMenu", "Message", "Landroid/os/Message;", "getMessage", "Method", "Ljava/lang/reflect/Method;", "getMethod", "MotionEvent", "Landroid/view/MotionEvent;", "getMotionEvent", "Notification", "Landroid/app/Notification;", "getNotification", "NotificationManager", "Landroid/app/NotificationManager;", "getNotificationManager", "Object", "Ljava/lang/Object;", "getObject", "ObjectArray", "", "getObjectArray", "Parcel", "Landroid/os/Parcel;", "getParcel", "Runnable", "Ljava/lang/Runnable;", "getRunnable", "SharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "StackTraceElement", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "StackTraceElementArray", "getStackTraceElementArray", "String", "", "getString", "StringArray", "getStringArray", "Throwable", "", "getThrowable", "View", "Landroid/view/View;", "getView", "ViewGroup", "Landroid/view/ViewGroup;", "getViewGroup", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: C.kt */
public final class C {
    private static final Class<Activity> Activity = Activity.class;
    private static final Class<AdapterView<?>> AdapterView = AdapterView.class;
    private static final Class<AdapterView.OnItemClickListener> AdapterView_OnItemClickListener = AdapterView.OnItemClickListener.class;
    private static final Class<ArrayList<?>> ArrayList = ArrayList.class;
    private static final Class<AttributeSet> AttributeSet = AttributeSet.class;
    private static final Class<BaseAdapter> BaseAdapter = BaseAdapter.class;
    private static final Class<Bitmap> Bitmap = Bitmap.class;
    private static final Class<Boolean> Boolean = Boolean.TYPE;
    private static final Class<Bundle> Bundle = Bundle.class;
    private static final Class<Button> Button = Button.class;
    private static final Class<byte[]> ByteArray = byte[].class;
    private static final Class<Class<?>> Clazz = Class.class;
    private static final Class<Configuration> Configuration = Configuration.class;
    private static final Class<ContentValues> ContentValues = ContentValues.class;
    private static final Class<Context> Context = Context.class;
    private static final Class<ContextMenu> ContextMenu = ContextMenu.class;
    private static final Class<ContextMenu.ContextMenuInfo> ContextMenuInfo = ContextMenu.ContextMenuInfo.class;
    private static final Class<Cursor> Cursor = Cursor.class;
    private static final Class<File> File = File.class;
    private static final Class<FileInputStream> FileInputStream = FileInputStream.class;
    private static final Class<FileOutputStream> FileOutputStream = FileOutputStream.class;
    private static final Class<Float> Float = Float.TYPE;
    private static final Class<HeaderViewListAdapter> HeaderViewListAdapter = HeaderViewListAdapter.class;
    public static final C INSTANCE = new C();
    private static final Class<InputStream> InputStream = InputStream.class;
    private static final Class<Integer> Int = Integer.TYPE;
    private static final Class<int[]> IntArray = int[].class;
    private static final Class<Integer> Integer = Integer.class;
    private static final Class<Intent> Intent = Intent.class;
    private static final Class<Iterator<?>> Iterator = Iterator.class;
    private static final Class<KeyEvent> KeyEvent = KeyEvent.class;
    private static final Class<LinkedList<?>> LinkedList = LinkedList.class;
    private static final Class<List<?>> List = List.class;
    private static final Class<ListAdapter> ListAdapter = ListAdapter.class;
    private static final Class<ListView> ListView = ListView.class;
    private static final Class<Long> Long = Long.TYPE;
    private static final Class<Looper> Looper = Looper.class;
    private static final Class<Map<?, ?>> Map = Map.class;
    private static final Class<Menu> Menu = Menu.class;
    private static final Class<Message> Message = Message.class;
    private static final Class<Method> Method = Method.class;
    private static final Class<MotionEvent> MotionEvent = MotionEvent.class;
    private static final Class<Notification> Notification = Notification.class;
    private static final Class<NotificationManager> NotificationManager = NotificationManager.class;
    private static final Class<Object> Object = Object.class;
    private static final Class<Object[]> ObjectArray = Object[].class;
    private static final Class<Parcel> Parcel = Parcel.class;
    private static final Class<Runnable> Runnable = Runnable.class;
    private static final Class<SharedPreferences> SharedPreferences = SharedPreferences.class;
    private static final Class<StackTraceElement> StackTraceElement = StackTraceElement.class;
    private static final Class<StackTraceElement[]> StackTraceElementArray = StackTraceElement[].class;
    private static final Class<String> String = String.class;
    private static final Class<String[]> StringArray = String[].class;
    private static final Class<Throwable> Throwable = Throwable.class;
    private static final Class<View> View = View.class;
    private static final Class<ViewGroup> ViewGroup = ViewGroup.class;

    private C() {
    }

    public final Class<Boolean> getBoolean() {
        return Boolean;
    }

    public final Class<File> getFile() {
        return File;
    }

    public final Class<InputStream> getInputStream() {
        return InputStream;
    }

    public final Class<FileInputStream> getFileInputStream() {
        return FileInputStream;
    }

    public final Class<FileOutputStream> getFileOutputStream() {
        return FileOutputStream;
    }

    public final Class<Integer> getInt() {
        return Int;
    }

    public final Class<Float> getFloat() {
        return Float;
    }

    public final Class<Integer> getInteger() {
        return Integer;
    }

    public final Class<Iterator<?>> getIterator() {
        return Iterator;
    }

    public final Class<Long> getLong() {
        return Long;
    }

    public final Class<Map<?, ?>> getMap() {
        return Map;
    }

    public final Class<Object> getObject() {
        return Object;
    }

    public final Class<Method> getMethod() {
        return Method;
    }

    public final Class<Class<?>> getClazz() {
        return Clazz;
    }

    public final Class<String> getString() {
        return String;
    }

    public final Class<Throwable> getThrowable() {
        return Throwable;
    }

    public final Class<Activity> getActivity() {
        return Activity;
    }

    public final Class<AdapterView<?>> getAdapterView() {
        return AdapterView;
    }

    public final Class<AdapterView.OnItemClickListener> getAdapterView_OnItemClickListener() {
        return AdapterView_OnItemClickListener;
    }

    public final Class<AttributeSet> getAttributeSet() {
        return AttributeSet;
    }

    public final Class<BaseAdapter> getBaseAdapter() {
        return BaseAdapter;
    }

    public final Class<Bundle> getBundle() {
        return Bundle;
    }

    public final Class<Button> getButton() {
        return Button;
    }

    public final Class<Configuration> getConfiguration() {
        return Configuration;
    }

    public final Class<ContentValues> getContentValues() {
        return ContentValues;
    }

    public final Class<Context> getContext() {
        return Context;
    }

    public final Class<ContextMenu> getContextMenu() {
        return ContextMenu;
    }

    public final Class<ContextMenu.ContextMenuInfo> getContextMenuInfo() {
        return ContextMenuInfo;
    }

    public final Class<HeaderViewListAdapter> getHeaderViewListAdapter() {
        return HeaderViewListAdapter;
    }

    public final Class<Intent> getIntent() {
        return Intent;
    }

    public final Class<KeyEvent> getKeyEvent() {
        return KeyEvent;
    }

    public final Class<ListAdapter> getListAdapter() {
        return ListAdapter;
    }

    public final Class<ListView> getListView() {
        return ListView;
    }

    public final Class<Menu> getMenu() {
        return Menu;
    }

    public final Class<Message> getMessage() {
        return Message;
    }

    public final Class<MotionEvent> getMotionEvent() {
        return MotionEvent;
    }

    public final Class<Notification> getNotification() {
        return Notification;
    }

    public final Class<NotificationManager> getNotificationManager() {
        return NotificationManager;
    }

    public final Class<View> getView() {
        return View;
    }

    public final Class<ViewGroup> getViewGroup() {
        return ViewGroup;
    }

    public final Class<byte[]> getByteArray() {
        return ByteArray;
    }

    public final Class<int[]> getIntArray() {
        return IntArray;
    }

    public final Class<Object[]> getObjectArray() {
        return ObjectArray;
    }

    public final Class<String[]> getStringArray() {
        return StringArray;
    }

    public final Class<ArrayList<?>> getArrayList() {
        return ArrayList;
    }

    public final Class<LinkedList<?>> getLinkedList() {
        return LinkedList;
    }

    public final Class<List<?>> getList() {
        return List;
    }

    public final Class<StackTraceElement> getStackTraceElement() {
        return StackTraceElement;
    }

    public final Class<StackTraceElement[]> getStackTraceElementArray() {
        return StackTraceElementArray;
    }

    public final Class<Parcel> getParcel() {
        return Parcel;
    }

    public final Class<SharedPreferences> getSharedPreferences() {
        return SharedPreferences;
    }

    public final Class<Cursor> getCursor() {
        return Cursor;
    }

    public final Class<Bitmap> getBitmap() {
        return Bitmap;
    }

    public final Class<Looper> getLooper() {
        return Looper;
    }

    public final Class<Runnable> getRunnable() {
        return Runnable;
    }
}

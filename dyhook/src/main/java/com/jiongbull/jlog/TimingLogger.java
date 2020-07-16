package com.jiongbull.jlog;

import android.os.SystemClock;
import java.util.ArrayList;

public class TimingLogger {
    private static final String TAG = "timing";
    private String mLabel;
    private Logger mLogger;
    private ArrayList<String> mSplitLabels;
    private ArrayList<Long> mSplits;
    private String mTag;

    public TimingLogger(String str, Logger logger) {
        reset(TAG, str, logger);
    }

    public TimingLogger(String str, String str2, Logger logger) {
        reset(str, str2, logger);
    }

    private void reset(String str, String str2, Logger logger) {
        this.mTag = str;
        this.mLabel = str2;
        this.mLogger = logger;
        reset();
    }

    private void reset() {
        ArrayList<Long> arrayList = this.mSplits;
        if (arrayList == null) {
            this.mSplits = new ArrayList<>();
            this.mSplitLabels = new ArrayList<>();
        } else {
            arrayList.clear();
            this.mSplitLabels.clear();
        }
        addSplit((String) null);
    }

    private void addSplit(String str) {
        this.mSplits.add(Long.valueOf(SystemClock.elapsedRealtime()));
        this.mSplitLabels.add(str);
    }

    public void dumpToLog() {
        Logger logger = this.mLogger;
        String str = this.mTag;
        logger.i(str, this.mLabel + " begin");
        long longValue = this.mSplits.get(0).longValue();
        long j = longValue;
        for (int i = 1; i < this.mSplits.size(); i++) {
            j = this.mSplits.get(i).longValue();
            long longValue2 = this.mSplits.get(i - 1).longValue();
            Logger logger2 = this.mLogger;
            String str2 = this.mTag;
            logger2.i(str2, this.mLabel + " " + (j - longValue2) + " ms, " + this.mSplitLabels.get(i));
        }
        Logger logger3 = this.mLogger;
        String str3 = this.mTag;
        logger3.i(str3, this.mLabel + " end, " + (j - longValue) + " ms");
    }
}

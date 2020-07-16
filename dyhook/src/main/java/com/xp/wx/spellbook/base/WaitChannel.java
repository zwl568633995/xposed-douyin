package com.xp.wx.spellbook.base;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/base/WaitChannel;", "", "()V", "channel", "Ljava/lang/Object;", "current", "", "getCurrent", "()J", "done", "", "", "isDone", "wait", "timeout", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WaitChannel.kt */
public final class WaitChannel {
    private final Object channel = new Object();
    private volatile boolean done;

    private final long getCurrent() {
        return System.currentTimeMillis();
    }

    public static /* synthetic */ boolean wait$default(WaitChannel waitChannel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return waitChannel.wait(j);
    }

    public final boolean wait(long j) {
        if (this.done) {
            return false;
        }
        long current = getCurrent();
        synchronized (this.channel) {
            while (!this.done) {
                long j2 = current + j;
                if (j2 <= getCurrent()) {
                    break;
                }
                this.channel.wait(j2 - getCurrent());
            }
        }
        return true;
    }

    public final void done() {
        if (!this.done) {
            synchronized (this.channel) {
                this.done = true;
                this.channel.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean isDone() {
        return this.done;
    }
}

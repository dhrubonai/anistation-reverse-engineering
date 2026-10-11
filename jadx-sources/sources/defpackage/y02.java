package defpackage;

import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class y02 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a12 b;

    public /* synthetic */ y02(a12 a12Var, byte b) {
        this.a = b;
        this.b = a12Var;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte b2 = 29;
        a12 a12Var = this.b;
        switch (b) {
            case 0:
                try {
                    a12Var.s();
                    return;
                } catch (RuntimeException e) {
                    a12Var.S = e;
                    kb0.t("ExtTexMgr", "Failed to remove texture frames", e);
                    CountDownLatch countDownLatch = a12Var.Q;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                        return;
                    }
                    return;
                }
            case 1:
                a12Var.M = null;
                if (a12Var.L && a12Var.G.isEmpty()) {
                    a12Var.L = false;
                    oa1 oa1Var = a12Var.B;
                    oa1Var.getClass();
                    oa1Var.b();
                    a61.a();
                    ScheduledFuture scheduledFuture = a12Var.P;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    a12Var.P = null;
                    return;
                }
                a12Var.r();
                return;
            case 2:
                a61.a();
                if (a12Var.O) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = a12Var.G;
                    bb2 bb2Var = a12Var.N;
                    bb2Var.getClass();
                    concurrentLinkedQueue.add(bb2Var);
                }
                if (a12Var.R) {
                    a12Var.E.updateTexImage();
                    a12Var.G.poll();
                    if (a12Var.Q != null && a12Var.G.isEmpty()) {
                        a12Var.Q.countDown();
                        return;
                    }
                    return;
                }
                if (a12Var.L) {
                    ScheduledFuture scheduledFuture2 = a12Var.P;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    a12Var.P = null;
                    a12Var.P = a12Var.H.schedule(new p0(a12Var, b2), a12.V, timeUnit);
                }
                a12Var.K++;
                a12Var.r();
                return;
            case 3:
                if (a12Var.K != a12Var.G.size()) {
                    int size = a12Var.G.size();
                    long j = a12.V;
                    int i = a12Var.K;
                    Locale locale = Locale.US;
                    kb0.O("ExtTexMgr", "Forcing EOS after missing " + size + " frames for " + j + " ms, with available frame count: " + i);
                    a12Var.L = false;
                    a12Var.M = null;
                    a12Var.R = true;
                    a12Var.s();
                    a12Var.G.clear();
                    a12Var.o();
                    return;
                }
                return;
            case 4:
                if (a12Var.O) {
                    a12Var.R = true;
                }
                if (a12Var.G.isEmpty() && a12Var.M == null) {
                    oa1 oa1Var2 = a12Var.B;
                    oa1Var2.getClass();
                    oa1Var2.b();
                    a61.a();
                    ScheduledFuture scheduledFuture3 = a12Var.P;
                    if (scheduledFuture3 != null) {
                        scheduledFuture3.cancel(false);
                    }
                    a12Var.P = null;
                    return;
                }
                a12Var.L = true;
                ScheduledFuture scheduledFuture4 = a12Var.P;
                if (scheduledFuture4 != null) {
                    scheduledFuture4.cancel(false);
                }
                a12Var.P = null;
                a12Var.P = a12Var.H.schedule(new p0(a12Var, b2), a12.V, timeUnit);
                return;
            default:
                a12Var.R = false;
                return;
        }
    }
}

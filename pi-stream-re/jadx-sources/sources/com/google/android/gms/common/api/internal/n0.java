package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class n0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final h f2442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2443b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2444c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2445d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2446e;

    public n0(h hVar, int i10, a aVar, long j4, long j10) {
        this.f2442a = hVar;
        this.f2443b = i10;
        this.f2444c = aVar;
        this.f2445d = j4;
        this.f2446e = j10;
    }

    public static com.google.android.gms.common.internal.i a(g0 g0Var, com.google.android.gms.common.internal.f fVar, int i10) {
        com.google.android.gms.common.internal.i telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f2531b) {
            boolean z9 = false;
            int[] iArr = telemetryConfiguration.f2533d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f2535f;
                if (iArr2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= iArr2.length) {
                            break;
                        }
                        if (iArr2[i11] == i10) {
                            z9 = true;
                            break;
                        }
                        i11++;
                    }
                    if (z9) {
                        return null;
                    }
                }
            } else {
                int i12 = 0;
                while (true) {
                    if (i12 >= iArr.length) {
                        break;
                    }
                    if (iArr[i12] == i10) {
                        z9 = true;
                        break;
                    }
                    i12++;
                }
                if (!z9) {
                    return null;
                }
            }
            if (g0Var.f2414l < telemetryConfiguration.f2534e) {
                return telemetryConfiguration;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        g0 g0Var;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j4;
        long j10;
        int i17;
        h hVar = this.f2442a;
        if (!hVar.c()) {
            return;
        }
        com.google.android.gms.common.internal.t tVar = com.google.android.gms.common.internal.s.a().f2594a;
        if ((tVar == null || tVar.f2596b) && (g0Var = (g0) hVar.A.get(this.f2444c)) != null) {
            Object obj = g0Var.f2404b;
            if (obj instanceof com.google.android.gms.common.internal.f) {
                com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                long j11 = this.f2445d;
                boolean z10 = true;
                if (j11 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int gCoreServiceId = fVar.getGCoreServiceId();
                if (tVar != null) {
                    z9 &= tVar.f2597c;
                    if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                        com.google.android.gms.common.internal.i a10 = a(g0Var, fVar, this.f2443b);
                        if (a10 == null) {
                            return;
                        }
                        if (!a10.f2532c || j11 <= 0) {
                            z10 = false;
                        }
                        i12 = a10.f2534e;
                        z9 = z10;
                    } else {
                        i12 = tVar.f2599e;
                    }
                    i10 = tVar.f2598d;
                    i11 = tVar.f2595a;
                } else {
                    i10 = 5000;
                    i11 = 0;
                    i12 = 100;
                }
                if (task.isSuccessful()) {
                    i16 = 0;
                    i15 = 0;
                } else {
                    if (task.isCanceled()) {
                        i13 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i13 = status.f2361b;
                            b5.a aVar = status.f2364e;
                            if (aVar == null) {
                                i14 = -1;
                            } else {
                                i14 = aVar.f1507b;
                            }
                            i15 = i14;
                            i16 = i13;
                        } else {
                            i13 = 101;
                        }
                    }
                    i15 = -1;
                    i16 = i13;
                }
                if (z9) {
                    j4 = j11;
                    j10 = System.currentTimeMillis();
                    i17 = (int) (SystemClock.elapsedRealtime() - this.f2446e);
                } else {
                    j4 = 0;
                    j10 = 0;
                    i17 = -1;
                }
                zaq zaqVar = hVar.E;
                zaqVar.sendMessage(zaqVar.obtainMessage(18, new o0(new com.google.android.gms.common.internal.q(this.f2443b, i16, i15, j4, j10, null, null, gCoreServiceId, i17), i11, i10, i12)));
            }
        }
    }
}

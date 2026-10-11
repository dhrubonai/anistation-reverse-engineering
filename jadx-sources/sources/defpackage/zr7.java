package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zr7 implements Runnable {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final /* synthetic */ byte x = 0;
    public final int y;
    public final String z;

    public /* synthetic */ zr7(String str, hs7 hs7Var, int i, IOException iOException, byte[] bArr, Map map) {
        this.A = hs7Var;
        this.y = i;
        this.B = iOException;
        this.C = bArr;
        this.z = str;
        this.D = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.x) {
            case 0:
                es7 es7Var = (es7) this.D;
                bt7 bt7Var = ((gu7) es7Var.x).B;
                gu7.j(bt7Var);
                if (bt7Var.y) {
                    if (es7Var.z == 0) {
                        ak7 ak7Var = ((gu7) es7Var.x).A;
                        if (ak7Var.B == null) {
                            synchronized (ak7Var) {
                                try {
                                    if (ak7Var.B == null) {
                                        gu7 gu7Var = (gu7) ak7Var.x;
                                        ApplicationInfo applicationInfo = gu7Var.x.getApplicationInfo();
                                        String str = m37.s;
                                        if (str == null) {
                                            str = Application.getProcessName();
                                            m37.s = str;
                                        }
                                        if (applicationInfo != null) {
                                            String str2 = applicationInfo.processName;
                                            if (str2 != null && str2.equals(str)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            ak7Var.B = Boolean.valueOf(z);
                                        }
                                        if (ak7Var.B == null) {
                                            ak7Var.B = Boolean.TRUE;
                                            es7 es7Var2 = gu7Var.C;
                                            gu7.l(es7Var2);
                                            es7Var2.C.a("My process not in the list of running processes");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (ak7Var.B.booleanValue()) {
                            es7Var.z = 'C';
                        } else {
                            es7Var.z = 'c';
                        }
                    }
                    long j = es7Var.A;
                    if (j < 0) {
                        ((gu7) es7Var.x).A.R();
                        j = 161000;
                        es7Var.A = 161000L;
                    }
                    int i = this.y;
                    char c = es7Var.z;
                    String str3 = this.z;
                    Object obj = this.A;
                    Object obj2 = this.B;
                    Object obj3 = this.C;
                    char charAt = "01VDIWEA?".charAt(i);
                    String S = es7.S(true, str3, obj, obj2, obj3);
                    StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + S.length());
                    sb.append(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                    sb.append(charAt);
                    sb.append(c);
                    sb.append(j);
                    sb.append(":");
                    sb.append(S);
                    String sb2 = sb.toString();
                    if (sb2.length() > 1024) {
                        sb2 = str3.substring(0, 1024);
                    }
                    ok2 ok2Var = bt7Var.B;
                    if (ok2Var != null) {
                        bt7 bt7Var2 = (bt7) ok2Var.z;
                        bt7Var2.L();
                        if (((bt7) ok2Var.z).P().getLong("health_monitor:start", 0L) == 0) {
                            ok2Var.F();
                        }
                        long j2 = bt7Var2.P().getLong("health_monitor:count", 0L);
                        if (j2 <= 0) {
                            SharedPreferences.Editor edit = bt7Var2.P().edit();
                            edit.putString("health_monitor:value", sb2);
                            edit.putLong("health_monitor:count", 1L);
                            edit.apply();
                            return;
                        }
                        i28 i28Var = ((gu7) bt7Var2.x).F;
                        gu7.j(i28Var);
                        long nextLong = i28Var.K0().nextLong() & Long.MAX_VALUE;
                        long j3 = j2 + 1;
                        long j4 = Long.MAX_VALUE / j3;
                        SharedPreferences.Editor edit2 = bt7Var2.P().edit();
                        if (nextLong < j4) {
                            edit2.putString("health_monitor:value", sb2);
                        }
                        edit2.putLong("health_monitor:count", j3);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, es7Var.R(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((hs7) this.A).b(this.z, this.y, (Throwable) this.B, (byte[]) this.C, (Map) this.D);
                return;
        }
    }

    public zr7(es7 es7Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.y = i;
        this.z = str;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = es7Var;
    }
}

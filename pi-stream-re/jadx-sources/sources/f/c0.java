package f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3638c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3640b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f3639a = i10;
        this.f3640b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        int i10 = this.f3639a;
        int i11 = 2;
        Object obj = this.f3640b;
        switch (i10) {
            case 0:
                ((d0) obj).f();
                return;
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i11 = type != 9 ? 8 : 7;
                                        }
                                        i11 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i11 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case zzaja.zze.zzg /* 7 */:
                                case 8:
                                case 9:
                                case 10:
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i11 = 4;
                                    break;
                                case 13:
                                    i11 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i11 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (f1.b0.f3799a >= 29) {
                                        i11 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i11 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (f1.b0.f3799a < 31 && i11 == 5) {
                        f1.r rVar = (f1.r) obj;
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            telephonyManager.getClass();
                            f1.q qVar = new f1.q(rVar);
                            mainExecutor = context.getMainExecutor();
                            telephonyManager.registerTelephonyCallback(mainExecutor, qVar);
                            telephonyManager.unregisterTelephonyCallback(qVar);
                            return;
                        } catch (RuntimeException unused2) {
                            f1.r.a(rVar, 5);
                            return;
                        }
                    }
                    f1.r.a((f1.r) obj, i11);
                    return;
                }
                i11 = 0;
                if (f1.b0.f3799a < 31) {
                }
                f1.r.a((f1.r) obj, i11);
                return;
            case 2:
                a3.g.z(obj);
                throw null;
            case 3:
                if (!isInitialStickyBroadcast()) {
                    l1.h hVar = (l1.h) obj;
                    hVar.a(l1.e.b(context, intent, hVar.f6668i, hVar.f6667h));
                    return;
                }
                return;
            default:
                i4.u uVar = (i4.u) obj;
                uVar.getClass();
                i4.u.f5371x.execute(new i4.t(uVar, 2));
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(l1.h hVar) {
        this(hVar, 3);
        this.f3639a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f1.r rVar) {
        this(rVar, 1);
        this.f3639a = 1;
    }
}

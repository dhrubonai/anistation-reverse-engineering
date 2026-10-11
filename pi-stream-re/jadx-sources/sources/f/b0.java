package f;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class b0 extends d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3630c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f3631d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, c cVar) {
        super(g0Var);
        this.f3631d = g0Var;
        this.f3632e = cVar;
    }

    @Override // f.d0
    public final IntentFilter c() {
        switch (this.f3630c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // f.d0
    public final int d() {
        boolean z9;
        Location location;
        boolean z10;
        long j4;
        long j10;
        int i10 = this.f3630c;
        Object obj = this.f3632e;
        switch (i10) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    return 1;
                }
                return 2;
            default:
                c cVar = (c) obj;
                r0 r0Var = (r0) cVar.f3637d;
                boolean z11 = false;
                if (r0Var.f3775a > System.currentTimeMillis()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    z10 = r0Var.f3776b;
                } else {
                    Location location2 = null;
                    if (com.bumptech.glide.c.j((Context) cVar.f3635b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = cVar.q("network");
                    } else {
                        location = null;
                    }
                    if (com.bumptech.glide.c.j((Context) cVar.f3635b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = cVar.q("gps");
                    }
                    if (location2 == null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location != null) {
                        r0 r0Var2 = (r0) cVar.f3637d;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (d2.g.f3141e == null) {
                            d2.g.f3141e = new d2.g();
                        }
                        d2.g gVar = d2.g.f3141e;
                        gVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        gVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (gVar.f3144c == 1) {
                            z11 = true;
                        }
                        long j11 = gVar.f3143b;
                        long j12 = gVar.f3142a;
                        gVar.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j13 = gVar.f3143b;
                        if (j11 != -1 && j12 != -1) {
                            if (currentTimeMillis > j12) {
                                j10 = j13 + 0;
                            } else if (currentTimeMillis > j11) {
                                j10 = j12 + 0;
                            } else {
                                j10 = j11 + 0;
                            }
                            j4 = j10 + 60000;
                        } else {
                            j4 = currentTimeMillis + 43200000;
                        }
                        r0Var2.f3776b = z11;
                        r0Var2.f3775a = j4;
                        z10 = r0Var.f3776b;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 < 6 || i11 >= 22) {
                            z11 = true;
                        }
                        z10 = z11;
                    }
                }
                if (!z10) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // f.d0
    public final void f() {
        int i10 = this.f3630c;
        g0 g0Var = this.f3631d;
        switch (i10) {
            case 0:
                g0Var.m(true, true);
                return;
            default:
                g0Var.m(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, Context context) {
        super(g0Var);
        this.f3631d = g0Var;
        this.f3632e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}

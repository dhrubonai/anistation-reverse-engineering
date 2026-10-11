package l1;

import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6722c;

    public /* synthetic */ p(int i10, Object obj, boolean z9) {
        this.f6720a = i10;
        this.f6722c = obj;
        this.f6721b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        float f10;
        int i10 = this.f6720a;
        int i11 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i12 = 1;
        boolean z11 = this.f6721b;
        Object obj = this.f6722c;
        switch (i10) {
            case 0:
                s sVar = (s) ((androidx.appcompat.widget.a0) obj).f404c;
                int i13 = f1.b0.f3799a;
                j1.d0 d0Var = ((j1.z) sVar).f5932a;
                if (d0Var.Z != z11) {
                    d0Var.Z = z11;
                    d0Var.f5683l.l(23, new j1.w(i12, z11));
                    return;
                }
                return;
            case 1:
                com.google.android.gms.common.api.internal.i0 i0Var = (com.google.android.gms.common.api.internal.i0) obj;
                i0Var.getClass();
                try {
                    ProgressBar progressBar = (ProgressBar) i0Var.f2434d;
                    if (!z11) {
                        i11 = 8;
                    }
                    progressBar.setVisibility(i11);
                    ((TextView) i0Var.f2435e).setEnabled(!z11);
                    TextView textView = (TextView) i0Var.f2435e;
                    if (z11) {
                        f10 = 0.5f;
                    } else {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(f10);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                int i14 = MainActivity.f7741b0;
                mainActivity.getClass();
                try {
                    y7.a aVar = mainActivity.f7749z;
                    int i15 = 4;
                    int i16 = 22;
                    Handler handler = mainActivity.E;
                    if (aVar == null) {
                        if (z11) {
                            handler.post(new f.m0(i16, mainActivity, "Couldn't check — try again"));
                        } else {
                            try {
                                z10 = mainActivity.getApplicationContext().getSharedPreferences("pistream_update", 0).getBoolean("force_pending", false);
                            } catch (Exception unused2) {
                            }
                            if (z10) {
                                handler.post(new l8.y(mainActivity, i15));
                            }
                        }
                    } else {
                        e0.a a10 = aVar.a(mainActivity);
                        if (a10.f3295a && ((c8.c) a10.f3297c) != null) {
                            if (!z11) {
                                try {
                                    mainActivity.getApplicationContext().getSharedPreferences("pistream_update", 0).edit().putLong("last_check_ms", System.currentTimeMillis()).apply();
                                } catch (Exception unused3) {
                                }
                            }
                            c8.c cVar = (c8.c) a10.f3297c;
                            try {
                                mainActivity.getApplicationContext().getSharedPreferences("pistream_update", 0).edit().putBoolean("force_pending", cVar.f2088f).apply();
                            } catch (Exception unused4) {
                            }
                            handler.post(new f.m0(21, mainActivity, cVar));
                        } else {
                            if (((c8.c) a10.f3297c) != null) {
                                i12 = 0;
                            }
                            if (i12 == 0) {
                                try {
                                    mainActivity.getApplicationContext().getSharedPreferences("pistream_update", 0).edit().putBoolean("force_pending", false).apply();
                                } catch (Exception unused5) {
                                }
                                if (z11) {
                                    handler.post(new f.m0(i16, mainActivity, "You're on the latest version"));
                                }
                            } else if (z11) {
                                handler.post(new f.m0(i16, mainActivity, "Couldn't check — check connection"));
                            } else {
                                try {
                                    z9 = mainActivity.getApplicationContext().getSharedPreferences("pistream_update", 0).getBoolean("force_pending", false);
                                } catch (Exception unused6) {
                                }
                                if (z9) {
                                    handler.post(new l8.y(mainActivity, i15));
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    Log.e("MainActivity", "update check", e10);
                    return;
                }
            default:
                o8.c cVar2 = (o8.c) obj;
                cVar2.getClass();
                if (z11) {
                    str = "Saved";
                } else {
                    str = "Capture failed";
                }
                cVar2.f8339a.y(str, true);
                return;
        }
    }
}

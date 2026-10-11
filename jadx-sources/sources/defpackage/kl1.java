package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.anistation.android.R;
import com.anistation.download.service.InternalDownloadService;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class kl1 extends Service {
    public static final HashMap F = new HashMap();
    public jl1 B;
    public int C;
    public boolean D;
    public boolean E;
    public final pn0 x = new pn0(this);
    public final String y = "episode_downloads";
    public final int z = R.string.download_service_channel;
    public final int A = R.string.download_service_channel_description;

    public static void c(Context context, il1 il1Var) {
        context.startService(new Intent(context, (Class<?>) InternalDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", il1Var).putExtra("stop_reason", 0));
    }

    public final void a(List list) {
        pn0 pn0Var = this.x;
        if (pn0Var != null) {
            for (int i = 0; i < list.size(); i++) {
                int i2 = ((cj1) list.get(i)).b;
                if (i2 == 2 || i2 == 5 || i2 == 7) {
                    pn0Var.y = true;
                    pn0Var.f();
                    return;
                }
            }
        }
    }

    public final void b() {
        pn0 pn0Var = this.x;
        if (pn0Var != null) {
            pn0Var.y = false;
            ((Handler) pn0Var.A).removeCallbacksAndMessages(null);
        }
        jl1 jl1Var = this.B;
        jl1Var.getClass();
        if (!jl1Var.i()) {
            return;
        }
        this.E |= stopSelfResult(this.C);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        boolean z;
        boolean z2;
        l33 l33Var;
        String str = this.y;
        if (str != null) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.z), 2);
            int i = this.A;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap hashMap = F;
        jl1 jl1Var = (jl1) hashMap.get(cls);
        boolean z3 = true;
        if (jl1Var == null) {
            if (this.x != null) {
                z = true;
            } else {
                z = false;
            }
            if (Build.VERSION.SDK_INT < 31) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                l33Var = new l33((InternalDownloadService) this);
            } else {
                l33Var = null;
            }
            InternalDownloadService internalDownloadService = (InternalDownloadService) this;
            ik1 ik1Var = wc4.g.w((ok1) internalDownloadService.G.getValue(), internalDownloadService).f;
            ik1Var.c(false);
            jl1 jl1Var2 = new jl1(getApplicationContext(), ik1Var, z, l33Var, cls);
            hashMap.put(cls, jl1Var2);
            jl1Var = jl1Var2;
        }
        this.B = jl1Var;
        if (jl1Var.f != null) {
            z3 = false;
        }
        io3.B(z3);
        jl1Var.f = this;
        if (jl1Var.b.g) {
            eq6.q(null).postAtFrontOfQueue(new gb(jl1Var, this, (byte) 25));
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        boolean z;
        jl1 jl1Var = this.B;
        jl1Var.getClass();
        if (jl1Var.f == this) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        jl1Var.f = null;
        pn0 pn0Var = this.x;
        if (pn0Var != null) {
            pn0Var.y = false;
            ((Handler) pn0Var.A).removeCallbacksAndMessages(null);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        pn0 pn0Var;
        boolean z;
        this.C = i2;
        if (intent != null) {
            str = intent.getAction();
            str2 = intent.getStringExtra("content_id");
            boolean z2 = this.D;
            if (!intent.getBooleanExtra("foreground", false) && !"androidx.media3.exoplayer.downloadService.action.RESTART".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            this.D = z2 | z;
        } else {
            str = null;
            str2 = null;
        }
        if (str == null) {
            str = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        jl1 jl1Var = this.B;
        jl1Var.getClass();
        ik1 ik1Var = jl1Var.b;
        char c = 65535;
        switch (str.hashCode()) {
            case -2068303304:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c = 0;
                    break;
                }
                break;
            case -1192305801:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c = 1;
                    break;
                }
                break;
            case -659421309:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c = 2;
                    break;
                }
                break;
            case -238450692:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c = 3;
                    break;
                }
                break;
            case 32678949:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c = 4;
                    break;
                }
                break;
            case 464223742:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c = 5;
                    break;
                }
                break;
            case 829812082:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c = 6;
                    break;
                }
                break;
            case 845668953:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c = 7;
                    break;
                }
                break;
            case 1746253622:
                if (str.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    kb0.s("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    ik1Var.e++;
                    ik1Var.b.obtainMessage(4, intExtra, 0, str2).sendToTarget();
                    break;
                }
            case 1:
                if (str2 == null) {
                    kb0.s("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    ik1Var.e++;
                    ik1Var.b.obtainMessage(8, str2).sendToTarget();
                    break;
                }
            case 2:
            case 3:
                break;
            case 4:
                ik1Var.c(false);
                break;
            case 5:
                ik1Var.e++;
                ik1Var.b.obtainMessage(9).sendToTarget();
                break;
            case 6:
                intent.getClass();
                il1 il1Var = (il1) intent.getParcelableExtra("download_request");
                if (il1Var == null) {
                    kb0.s("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    ik1Var.e++;
                    ik1Var.b.obtainMessage(7, intExtra2, 0, il1Var).sendToTarget();
                    break;
                }
            case 7:
                intent.getClass();
                u35 u35Var = (u35) intent.getParcelableExtra("requirements");
                if (u35Var == null) {
                    kb0.s("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    ik1Var.d(u35Var);
                    break;
                }
            case '\b':
                ik1Var.c(true);
                break;
            default:
                kb0.s("DownloadService", "Ignored unrecognized action: ".concat(str));
                break;
        }
        if (this.D && (pn0Var = this.x) != null && !pn0Var.z) {
            pn0Var.f();
        }
        this.E = false;
        if (ik1Var.f == 0 && ik1Var.e == 0) {
            b();
        }
        return 1;
    }

    public final void onTimeout(int i, int i2) {
        kb0.O("DownloadService", "onTimeout() called by system. Calling stopSelf() to terminate gracefully.");
        stopSelf();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}

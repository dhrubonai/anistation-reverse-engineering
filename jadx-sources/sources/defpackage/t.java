package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.anistation.model.Anime;
import com.anistation.model.AnimeWatchOrderItem;
import com.anistation.model.schedule.AnimeSchedule;
import com.anistation.model.update.AppUpdateCheck;
import com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver;
import com.unity3d.ads.core.data.repository.AccelerometerRepository;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ t(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        Choreographer choreographer;
        byte b = this.x;
        vz0 vz0Var = null;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return pn6Var;
            case 1:
                return Long.valueOf(AccelerometerRepository.a());
            case 2:
                return Integer.valueOf(o2.x.d(2147418112) + 65536);
            case 3:
                return UUID.randomUUID().toString();
            case 4:
                eb.a("LocalConfiguration");
                throw null;
            case 5:
                eb.a("LocalContext");
                throw null;
            case 6:
                eb.a("LocalImageVectorCache");
                throw null;
            case 7:
                eb.a("LocalResourceIdCache");
                throw null;
            case 8:
                eb.a("LocalView");
                throw null;
            case 9:
                return UUID.randomUUID();
            case 10:
                return UUID.randomUUID();
            case 11:
                return "DEFAULT_TEST_TAG";
            case 12:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    ja1 ja1Var = rh1.a;
                    choreographer = (Choreographer) bx7.K(qm3.a, new pf(2, vz0Var, (byte) 0));
                }
                sf sfVar = new sf(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return sfVar.plus(sfVar.H);
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return pn6Var;
            case 19:
                return Anime.b();
            case 20:
                return Anime.a();
            case 21:
                return Anime.c();
            case 22:
                return AnimeSchedule.a();
            case 23:
                return AnimeSchedule.b();
            case 24:
                return AnimeSchedule.c();
            case 25:
                return AnimeWatchOrderItem.a();
            case 26:
                return Long.valueOf(AppForegroundDurationObserver.a());
            case 27:
                return Long.valueOf(AppForegroundDurationObserver.b());
            case 28:
                return AppUpdateCheck.a();
            default:
                return pn6Var;
        }
    }
}

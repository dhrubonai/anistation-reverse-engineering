package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o27 extends t36 implements ub2 {
    public final /* synthetic */ Info A;
    public final /* synthetic */ Episode B;
    public final /* synthetic */ int C;
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public boolean x;
    public final /* synthetic */ v27 y;
    public final /* synthetic */ WatchSession z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o27(v27 v27Var, WatchSession watchSession, Info info, Episode episode, int i, String str, String str2, String str3, long j, long j2, vz0 vz0Var) {
        super(1, vz0Var);
        this.y = v27Var;
        this.z = watchSession;
        this.A = info;
        this.B = episode;
        this.C = i;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.G = j;
        this.H = j2;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new o27(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((o27) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String anistationId;
        boolean z = this.x;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            cy6 cy6Var = this.y.d;
            WatchSession watchSession = this.z;
            int anilistId = watchSession.getAnilistId();
            Info info = this.A;
            if (info == null || (anistationId = info.getId()) == null) {
                anistationId = watchSession.getAnistationId();
            }
            Episode episode = this.B;
            String title = episode.getTitle();
            if (title == null) {
                title = qx1.h(episode.getNumber(), "Episode ");
            }
            int number = episode.getNumber();
            this.x = true;
            Object b = ((ny6) cy6Var).b(anistationId, anilistId, this.C, this.D, title, number, this.E, this.F, this.G, this.H, this);
            w11 w11Var = w11.x;
            if (b == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}

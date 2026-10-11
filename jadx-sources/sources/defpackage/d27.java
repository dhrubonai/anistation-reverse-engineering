package defpackage;

import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d27 extends t36 implements ic2 {
    public final /* synthetic */ WatchSession A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d27(v27 v27Var, WatchSession watchSession, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
        this.A = watchSession;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        WatchSession watchSession = this.A;
        v27 v27Var = this.z;
        switch (b) {
            case 0:
                return new d27(v27Var, watchSession, vz0Var, (byte) 0);
            case 1:
                return new d27(v27Var, watchSession, vz0Var, (byte) 1);
            default:
                return new d27(v27Var, watchSession, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((d27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((d27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((d27) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        byte b2 = 11;
        pn6 pn6Var = pn6.a;
        int i = 0;
        WatchSession watchSession = this.A;
        w11 w11Var = w11.x;
        v27 v27Var = this.z;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cy6 cy6Var = v27Var.d;
                String animeId = watchSession.getAnimeId();
                int anilistId = watchSession.getAnilistId();
                ny6 ny6Var = (ny6) cy6Var;
                ny6Var.getClass();
                animeId.getClass();
                mx0 mx0Var = new mx0(new iy6(ny6Var, animeId, anilistId, null, (byte) 0), (byte) 5);
                ja1 ja1Var = rh1.a;
                w42 D = zz.D(mx0Var, j91.y);
                c27 c27Var = new c27(v27Var, null, (byte) 0);
                this.y = true;
                if (iv.q(D, c27Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cn cnVar = v27Var.f;
                String animeId2 = watchSession.getAnimeId();
                on onVar = (on) cnVar;
                onVar.getClass();
                animeId2.getClass();
                tm tmVar = onVar.b;
                Integer J = b06.J(10, animeId2);
                if (J != null) {
                    i = J.intValue();
                }
                w42 observeIsSaved = tmVar.observeIsSaved(animeId2, i);
                vz6 vz6Var = new vz6(v27Var, vz0Var, b2);
                this.y = true;
                if (iv.q(observeIsSaved, vz6Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                cn cnVar2 = v27Var.f;
                String animeId3 = watchSession.getAnimeId();
                on onVar2 = (on) cnVar2;
                onVar2.getClass();
                animeId3.getClass();
                tm tmVar2 = onVar2.b;
                Integer J2 = b06.J(10, animeId3);
                if (J2 != null) {
                    i = J2.intValue();
                }
                in inVar = new in(tmVar2.observeByIdentity(animeId3, i), (byte) 1);
                c27 c27Var2 = new c27(v27Var, null, (byte) 11);
                this.y = true;
                if (iv.q(inVar, c27Var2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}

package defpackage;

import com.anistation.navigation.Route;
import com.anistation.navigation.a;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hi extends t36 implements ic2 {
    public final /* synthetic */ String x;
    public final /* synthetic */ a y;
    public final /* synthetic */ sb2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(String str, a aVar, sb2 sb2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = str;
        this.y = aVar;
        this.z = sb2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new hi(this.x, this.y, this.z, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        hi hiVar = (hi) create((v11) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        hiVar.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        m37.N(obj);
        String str = this.x;
        if (str != null) {
            this.y.d(new Route.Details(str));
            this.z.invoke();
        }
        return pn6.a;
    }
}

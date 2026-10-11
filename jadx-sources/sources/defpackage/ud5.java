package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ud5 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ vd5 y;

    public /* synthetic */ ud5(vd5 vd5Var, byte b) {
        this.x = b;
        this.y = vd5Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vd5 vd5Var = this.y;
        jm0 jm0Var = (jm0) obj;
        switch (b) {
            case 0:
                jm0Var.getClass();
                jm0.a(jm0Var, HandleInvocationsFromAdViewer.KEY_AD_TYPE, mz5.b);
                jm0.a(jm0Var, "value", dj5.buildSerialDescriptor("kotlinx.serialization.Sealed<" + vd5Var.a.f() + '>', fj5.a, new aj5[0], new ud5(vd5Var, (byte) 1)));
                List list = vd5Var.b;
                list.getClass();
                jm0Var.b = list;
                return pn6Var;
            default:
                jm0Var.getClass();
                for (Map.Entry entry : vd5Var.e.entrySet()) {
                    jm0.a(jm0Var, (String) entry.getKey(), ((x73) entry.getValue()).getDescriptor());
                }
                return pn6Var;
        }
    }
}

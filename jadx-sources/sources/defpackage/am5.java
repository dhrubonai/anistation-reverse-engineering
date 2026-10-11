package defpackage;

import com.anistation.model.Resource;
import com.anistation.model.github.DevProfile;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class am5 implements x42 {
    public final /* synthetic */ hm5 x;
    public final /* synthetic */ zg y;

    public am5(hm5 hm5Var, zg zgVar) {
        this.x = hm5Var;
        this.y = zgVar;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        Object value;
        Resource resource = (Resource) obj;
        if (resource != null) {
            if (resource instanceof Resource.Success) {
                sx5 sx5Var = this.x.j;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, (DevProfile) ((Resource.Success) resource).getData(), false, false, false, false, 260046847)));
            } else if (resource instanceof Resource.Error) {
                this.y.invoke(((Resource.Error) resource).getMessage());
            }
        }
        return pn6.a;
    }
}

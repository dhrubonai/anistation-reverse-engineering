package defpackage;

import com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class u22 implements ni5 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public u22(File file, v22 v22Var) {
        this.a = (byte) 0;
        file.getClass();
        this.b = file;
        this.c = v22Var;
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new s22(this);
            case 1:
                return new h42(this);
            case 2:
                return new xd2(this);
            case 3:
                os osVar = (os) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) osVar.b).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                cp0.X(arrayList, (CleanupDirectory$invoke$$inlined$sortedBy$1) this.c);
                return arrayList.iterator();
            default:
                return new oi6(this);
        }
    }

    public /* synthetic */ u22(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public u22(os osVar, hi0 hi0Var) {
        this.a = (byte) 1;
        yi5 yi5Var = yi5.x;
        this.b = osVar;
        this.c = hi0Var;
    }
}

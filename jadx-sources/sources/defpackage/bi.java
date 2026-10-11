package defpackage;

import com.anistation.navigation.Route;
import com.anistation.navigation.a;
import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class bi implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ a y;

    public /* synthetic */ bi(a aVar, byte b) {
        this.x = b;
        this.y = aVar;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        a aVar = this.y;
        switch (b) {
            case 0:
                aVar.b();
                return pn6Var;
            case 1:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            case 2:
                aVar.b();
                return pn6Var;
            case 3:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            case 4:
                aVar.b();
                return pn6Var;
            case 5:
                aVar.b();
                return pn6Var;
            case 6:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            case 7:
                aVar.b();
                return pn6Var;
            case 8:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            case 9:
                aVar.b();
                return pn6Var;
            case 10:
                aVar.b();
                return pn6Var;
            case 11:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            case 12:
                aVar.d(Route.Search.INSTANCE);
                return pn6Var;
            default:
                zt5 zt5Var = aVar.d;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = zt5Var.listIterator();
                while (true) {
                    gl2 gl2Var = (gl2) listIterator;
                    if (gl2Var.hasNext()) {
                        dp0.Y((Iterable) vn3.Q((Route) gl2Var.next(), aVar.e), arrayList);
                    } else {
                        return arrayList;
                    }
                }
        }
    }
}

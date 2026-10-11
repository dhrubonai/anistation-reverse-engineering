package defpackage;

import android.view.DragEvent;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bc implements View.OnDragListener, fn1 {
    public final hn1 a = new hn1(null, 3);
    public final ls b = new ls(0);
    public final ac c = new ac(this);

    /* JADX WARN: Type inference failed for: r6v2, types: [r05, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        an1 an1Var = new an1(dragEvent);
        int action = dragEvent.getAction();
        ls lsVar = this.b;
        hn1 hn1Var = this.a;
        switch (action) {
            case 1:
                ?? obj = new Object();
                bg bgVar = new bg((Object) an1Var, (Object) hn1Var, (Object) obj, (byte) 11);
                if (bgVar.invoke(hn1Var) == ij6.x) {
                    iv5.l(hn1Var, bgVar);
                }
                boolean z = obj.x;
                fs fsVar = new fs(lsVar);
                while (fsVar.hasNext()) {
                    ((in1) fsVar.next()).r0(an1Var);
                }
                return z;
            case 2:
                hn1Var.t0(an1Var);
                return false;
            case 3:
                return hn1Var.M0(an1Var);
            case 4:
                hn1Var.B(an1Var);
                lsVar.clear();
                return false;
            case 5:
                hn1Var.t(an1Var);
                return false;
            case 6:
                hn1Var.j0(an1Var);
                return false;
            default:
                return false;
        }
    }
}

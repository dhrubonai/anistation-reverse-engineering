package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vf3 implements en4 {
    public final View a;
    public final pz2 b;
    public uf3 e;
    public jb6 f;
    public rv6 g;
    public Rect l;
    public final pf3 m;
    public ub2 c = new p03((byte) 13);
    public ub2 d = new p03((byte) 14);
    public mc6 h = new mc6(nd6.b, 4, "");
    public yv2 i = yv2.g;
    public final ArrayList j = new ArrayList();
    public final rb3 k = bx7.B(jf3.z, new vt0(this, (byte) 20));

    public vf3(View view, zj1 zj1Var, pz2 pz2Var) {
        this.a = view;
        this.b = pz2Var;
        this.m = new pf3(zj1Var, pz2Var);
    }

    @Override // defpackage.en4
    public final InputConnection a(EditorInfo editorInfo) {
        mc6 mc6Var = this.h;
        jf7.O(editorInfo, mc6Var.a.y, mc6Var.b, this.i);
        qf3 qf3Var = rf3.a;
        if (ks1.d()) {
            ks1.a().i(editorInfo);
        }
        k05 k05Var = new k05(this.h, new i75(this, (byte) 29), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(k05Var));
        return k05Var;
    }
}

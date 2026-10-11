package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r57 extends q57 {
    public r57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var, windowInsets);
    }

    @Override // defpackage.k57, defpackage.s57
    public List<Rect> f(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(u57.a(i));
        return boundingRects;
    }

    @Override // defpackage.k57, defpackage.s57
    public List<Rect> g(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(u57.a(i));
        return boundingRectsIgnoringVisibility;
    }

    public r57(v57 v57Var, r57 r57Var) {
        super(v57Var, r57Var);
    }

    @Override // defpackage.k57, defpackage.s57
    public void q() {
    }
}

package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p3 extends ClickableSpan {
    public final int x;
    public final g4 y;
    public final int z;

    public p3(int i, g4 g4Var, int i2) {
        this.x = i;
        this.y = g4Var;
        this.z = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.x);
        this.y.a.performAction(this.z, bundle);
    }
}

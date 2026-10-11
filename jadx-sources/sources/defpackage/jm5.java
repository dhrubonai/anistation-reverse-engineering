package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm5 extends CharacterStyle implements UpdateAppearance {
    public final im5 x;
    public final float y;
    public final ti4 z = xt5.g(new uq5(9205357640488583168L));
    public final he1 A = ut5.b(new nj4(this, 22));

    public jm5(im5 im5Var, float f) {
        this.x = im5Var;
        this.y = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        tl7.O(textPaint, this.y);
        textPaint.setShader((Shader) this.A.getValue());
    }
}

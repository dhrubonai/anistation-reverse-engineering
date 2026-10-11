package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import com.anistation.android.R;
import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.settings.SubtitleStyleSettings;
import java.util.Collections;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ea3 extends FrameLayout {
    public final n26 A;
    public final n26 B;
    public final float x;
    public final int y;
    public final int z;

    public ea3(Context context) {
        super(context);
        float f = getResources().getDisplayMetrics().density;
        this.x = f;
        this.y = io3.h0(12.0f * f);
        this.z = io3.h0(f * 4.0f);
        n26 b = b();
        addView(b);
        this.A = b;
        n26 b2 = b();
        addView(b2);
        this.B = b2;
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void a(n26 n26Var, int i, SubtitleStyleSettings subtitleStyleSettings) {
        Typeface typeface;
        int i2;
        Object y45Var;
        n26Var.setFractionalTextSize(subtitleStyleSettings.getFontScale() * 0.053f);
        n26Var.setBottomPaddingFraction(db.B(1.0f - subtitleStyleSettings.getVerticalPosition(), 0.04f, 0.45f));
        SubtitleFontFamily fontFamily = subtitleStyleSettings.getFontFamily();
        Context context = getContext();
        context.getClass();
        boolean isBold = subtitleStyleSettings.isBold();
        if (isBold) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        int i3 = qp4.a[fontFamily.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (isBold) {
                            i2 = R.font.levenim_bold;
                        } else {
                            i2 = R.font.levenim_regular;
                        }
                    } else {
                        ze0.l();
                        return;
                    }
                } else if (isBold) {
                    i2 = R.font.inter_bold;
                } else {
                    i2 = R.font.inter_regular;
                }
            } else if (isBold) {
                i2 = R.font.trebuchet_bold;
            } else {
                i2 = R.font.trebuchet_regular;
            }
            try {
                y45Var = m45.a(context, i2);
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            if (y45Var instanceof y45) {
                y45Var = null;
            }
            Typeface typeface2 = (Typeface) y45Var;
            if (typeface2 == null) {
                typeface.getClass();
            } else {
                typeface = typeface2;
            }
        } else {
            typeface.getClass();
        }
        n26Var.setStyle(new ah0(i, 0, 0, 0, 0, typeface));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n26, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    public final n26 b() {
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context, null);
        frameLayout.x = Collections.EMPTY_LIST;
        frameLayout.y = ah0.g;
        frameLayout.z = 0.0533f;
        frameLayout.A = 0.08f;
        frameLayout.B = true;
        frameLayout.C = true;
        zg0 zg0Var = new zg0(context, 0);
        frameLayout.E = zg0Var;
        frameLayout.F = zg0Var;
        frameLayout.addView(zg0Var);
        frameLayout.D = 1;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        frameLayout.setImportantForAccessibility(2);
        int i = this.y;
        int i2 = this.z;
        frameLayout.setPadding(i, i2, i, i2);
        frameLayout.setApplyEmbeddedStyles(true);
        frameLayout.setApplyEmbeddedFontSizes(false);
        frameLayout.setViewType(1);
        return frameLayout;
    }
}

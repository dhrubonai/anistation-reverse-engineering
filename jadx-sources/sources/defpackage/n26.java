package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.anistation.model.settings.SubtitleArgbColor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n26 extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public m26 E;
    public View F;
    public List x;
    public ah0 y;
    public float z;

    private List<b31> getCuesWithStylingPreferencesApplied() {
        if (this.B && this.C) {
            return this.x;
        }
        ArrayList arrayList = new ArrayList(this.x.size());
        for (int i = 0; i < this.x.size(); i++) {
            a31 a = ((b31) this.x.get(i)).a();
            if (!this.B) {
                a.n = false;
                CharSequence charSequence = a.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        charSequence = SpannableString.valueOf(charSequence);
                        a.a = charSequence;
                        a.b = null;
                    }
                    charSequence.getClass();
                    Spannable spannable = (Spannable) charSequence;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof y93)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                gv5.h(a);
            } else if (!this.C) {
                gv5.h(a);
            }
            arrayList.add(a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ah0 getUserCaptionStyle() {
        int i;
        int i2;
        int i3;
        boolean isInEditMode = isInEditMode();
        ah0 ah0Var = ah0.g;
        if (isInEditMode) {
            return ah0Var;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            int i4 = -1;
            if (userStyle.hasForegroundColor()) {
                i = userStyle.foregroundColor;
            } else {
                i = -1;
            }
            if (userStyle.hasBackgroundColor()) {
                i2 = userStyle.backgroundColor;
            } else {
                i2 = SubtitleArgbColor.BLACK;
            }
            int i5 = 0;
            if (userStyle.hasWindowColor()) {
                i3 = userStyle.windowColor;
            } else {
                i3 = 0;
            }
            if (userStyle.hasEdgeType()) {
                i5 = userStyle.edgeType;
            }
            if (userStyle.hasEdgeColor()) {
                i4 = userStyle.edgeColor;
            }
            return new ah0(i, i2, i3, i5, i4, userStyle.getTypeface());
        }
        return ah0Var;
    }

    private <T extends View & m26> void setView(T t) {
        removeView(this.F);
        View view = this.F;
        if (view instanceof a47) {
            ((a47) view).y.destroy();
        }
        this.F = t;
        this.E = t;
        addView(t);
    }

    public final void a() {
        this.E.a(getCuesWithStylingPreferencesApplied(), this.y, this.z, this.A);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.C = z;
        a();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.B = z;
        a();
    }

    public void setBottomPaddingFraction(float f) {
        this.A = f;
        a();
    }

    public void setCues(List<b31> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.x = list;
        a();
    }

    public void setFractionalTextSize(float f) {
        this.z = f;
        a();
    }

    public void setStyle(ah0 ah0Var) {
        this.y = ah0Var;
        a();
    }

    public void setViewType(int i) {
        if (this.D == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new a47(getContext()));
            } else {
                p65.b();
                return;
            }
        } else {
            setView(new zg0(getContext(), 0));
        }
        this.D = i;
    }
}

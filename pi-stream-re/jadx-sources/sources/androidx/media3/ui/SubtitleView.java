package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import e1.a;
import e1.b;
import f1.b0;
import h1.p;
import j3.c;
import j3.d;
import j3.o0;
import j3.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q6.g;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public View A;

    /* renamed from: a, reason: collision with root package name */
    public List f1199a;

    /* renamed from: b, reason: collision with root package name */
    public d f1200b;

    /* renamed from: c, reason: collision with root package name */
    public int f1201c;

    /* renamed from: d, reason: collision with root package name */
    public float f1202d;

    /* renamed from: e, reason: collision with root package name */
    public float f1203e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1204f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1205x;

    /* renamed from: y, reason: collision with root package name */
    public int f1206y;

    /* renamed from: z, reason: collision with root package name */
    public o0 f1207z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1199a = Collections.emptyList();
        this.f1200b = d.f5956g;
        this.f1201c = 0;
        this.f1202d = 0.0533f;
        this.f1203e = 0.08f;
        this.f1204f = true;
        this.f1205x = true;
        c cVar = new c(context);
        this.f1207z = cVar;
        this.A = cVar;
        addView(cVar);
        this.f1206y = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f1204f && this.f1205x) {
            return this.f1199a;
        }
        ArrayList arrayList = new ArrayList(this.f1199a.size());
        for (int i10 = 0; i10 < this.f1199a.size(); i10++) {
            b bVar = (b) this.f1199a.get(i10);
            bVar.getClass();
            a aVar = new a(bVar);
            if (!this.f1204f) {
                aVar.f3335n = false;
                CharSequence charSequence = aVar.f3322a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVar.f3322a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVar.f3322a;
                    charSequence2.getClass();
                    g.Z((Spannable) charSequence2, new p(2));
                }
                g.Y(aVar);
            } else if (!this.f1205x) {
                g.Y(aVar);
            }
            arrayList.add(aVar.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (b0.f3799a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        d dVar;
        int i10;
        int i11;
        int i12;
        int i13 = b0.f3799a;
        d dVar2 = d.f5956g;
        if (i13 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i13 >= 21) {
                int i14 = -1;
                if (userStyle.hasForegroundColor()) {
                    i10 = userStyle.foregroundColor;
                } else {
                    i10 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i11 = userStyle.backgroundColor;
                } else {
                    i11 = -16777216;
                }
                int i15 = i11;
                int i16 = 0;
                if (userStyle.hasWindowColor()) {
                    i12 = userStyle.windowColor;
                } else {
                    i12 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i16 = userStyle.edgeType;
                }
                int i17 = i16;
                if (userStyle.hasEdgeColor()) {
                    i14 = userStyle.edgeColor;
                }
                dVar = new d(i10, i15, i12, i17, i14, userStyle.getTypeface());
            } else {
                dVar = new d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return dVar;
        }
        return dVar2;
    }

    private <T extends View & o0> void setView(T t9) {
        removeView(this.A);
        View view = this.A;
        if (view instanceof u0) {
            ((u0) view).f6096b.destroy();
        }
        this.A = t9;
        this.f1207z = t9;
        addView(t9);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f1207z.a(getCuesWithStylingPreferencesApplied(), this.f1200b, this.f1202d, this.f1201c, this.f1203e);
    }

    public void setApplyEmbeddedFontSizes(boolean z9) {
        this.f1205x = z9;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z9) {
        this.f1204f = z9;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f1203e = f10;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f1199a = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f1201c = 0;
        this.f1202d = f10;
        c();
    }

    public void setStyle(d dVar) {
        this.f1200b = dVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f1206y == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new u0(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new c(getContext()));
        }
        this.f1206y = i10;
    }
}

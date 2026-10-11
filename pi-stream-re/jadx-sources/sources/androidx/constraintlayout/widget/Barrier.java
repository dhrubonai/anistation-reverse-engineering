package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q.a;
import q.e;
import s.b;
import s.q;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: x, reason: collision with root package name */
    public int f761x;

    /* renamed from: y, reason: collision with root package name */
    public int f762y;

    /* renamed from: z, reason: collision with root package name */
    public a f763z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // s.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f763z = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f9715b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f763z.f8785g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f763z.f8786h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f9592d = this.f763z;
        g();
    }

    @Override // s.b
    public final void f(e eVar, boolean z9) {
        int i10 = this.f761x;
        this.f762y = i10;
        if (z9) {
            if (i10 == 5) {
                this.f762y = 1;
            } else if (i10 == 6) {
                this.f762y = 0;
            }
        } else if (i10 == 5) {
            this.f762y = 0;
        } else if (i10 == 6) {
            this.f762y = 1;
        }
        if (eVar instanceof a) {
            ((a) eVar).f8784f0 = this.f762y;
        }
    }

    public int getMargin() {
        return this.f763z.f8786h0;
    }

    public int getType() {
        return this.f761x;
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f763z.f8785g0 = z9;
    }

    public void setDpMargin(int i10) {
        this.f763z.f8786h0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f763z.f8786h0 = i10;
    }

    public void setType(int i10) {
        this.f761x = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}

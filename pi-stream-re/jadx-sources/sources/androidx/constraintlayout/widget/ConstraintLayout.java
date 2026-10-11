package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import q.f;
import q.i;
import s.b;
import s.d;
import s.e;
import s.g;
import s.m;
import s.n;
import s.o;
import s.q;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final /* synthetic */ int G = 0;
    public m A;
    public g B;
    public int C;
    public HashMap D;
    public final SparseArray E;
    public final e F;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f764a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f765b;

    /* renamed from: c, reason: collision with root package name */
    public final f f766c;

    /* renamed from: d, reason: collision with root package name */
    public int f767d;

    /* renamed from: e, reason: collision with root package name */
    public int f768e;

    /* renamed from: f, reason: collision with root package name */
    public int f769f;

    /* renamed from: x, reason: collision with root package name */
    public int f770x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f771y;

    /* renamed from: z, reason: collision with root package name */
    public int f772z;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f764a = new SparseArray();
        this.f765b = new ArrayList(4);
        this.f766c = new f();
        this.f767d = 0;
        this.f768e = 0;
        this.f769f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f770x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f771y = true;
        this.f772z = 263;
        this.A = null;
        this.B = null;
        this.C = -1;
        this.D = new HashMap();
        this.E = new SparseArray();
        this.F = new e(this);
        b(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final q.e a(View view) {
        if (view == this) {
            return this.f766c;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f9617k0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        f fVar = this.f766c;
        fVar.U = this;
        e eVar = this.F;
        fVar.f8850g0 = eVar;
        fVar.f8849f0.f9268h = eVar;
        this.f764a.put(getId(), this);
        this.A = null;
        boolean z9 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f9715b, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 9) {
                    this.f767d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f767d);
                } else if (index == 10) {
                    this.f768e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f768e);
                } else if (index == 7) {
                    this.f769f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f769f);
                } else if (index == 8) {
                    this.f770x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f770x);
                } else if (index == 89) {
                    this.f772z = obtainStyledAttributes.getInt(index, this.f772z);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.B = new g(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.B = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.A = mVar;
                        mVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.A = null;
                    }
                    this.C = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i12 = this.f772z;
        fVar.f8859p0 = i12;
        if ((i12 & 256) == 256) {
            z9 = true;
        }
        p.e.f8367p = z9;
    }

    public final boolean c() {
        boolean z9;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.D == null) {
                this.D = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.D.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f765b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((b) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e():boolean");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f771y = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f770x;
    }

    public int getMaxWidth() {
        return this.f769f;
    }

    public int getMinHeight() {
        return this.f768e;
    }

    public int getMinWidth() {
        return this.f767d;
    }

    public int getOptimizationLevel() {
        return this.f766c.f8859p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d dVar = (d) childAt.getLayoutParams();
            q.e eVar = dVar.f9617k0;
            if (childAt.getVisibility() != 8 || dVar.Y || dVar.Z || isInEditMode) {
                int n9 = eVar.n();
                int o = eVar.o();
                childAt.layout(n9, o, eVar.m() + n9, eVar.j() + o);
            }
        }
        ArrayList arrayList = this.f765b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((b) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0210  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        q.e a10 = a(view);
        if ((view instanceof o) && !(a10 instanceof i)) {
            d dVar = (d) view.getLayoutParams();
            i iVar = new i();
            dVar.f9617k0 = iVar;
            dVar.Y = true;
            iVar.C(dVar.R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.g();
            ((d) view.getLayoutParams()).Z = true;
            ArrayList arrayList = this.f765b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f764a.put(view.getId(), view);
        this.f771y = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f764a.remove(view.getId());
        q.e a10 = a(view);
        this.f766c.f8847d0.remove(a10);
        a10.I = null;
        this.f765b.remove(view);
        this.f771y = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f771y = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.A = mVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray sparseArray = this.f764a;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f770x) {
            return;
        }
        this.f770x = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f769f) {
            return;
        }
        this.f769f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f768e) {
            return;
        }
        this.f768e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f767d) {
            return;
        }
        this.f767d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        g gVar = this.B;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        boolean z9;
        this.f772z = i10;
        this.f766c.f8859p0 = i10;
        if ((i10 & 256) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        p.e.f8367p = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f764a = new SparseArray();
        this.f765b = new ArrayList(4);
        this.f766c = new f();
        this.f767d = 0;
        this.f768e = 0;
        this.f769f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f770x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f771y = true;
        this.f772z = 263;
        this.A = null;
        this.B = null;
        this.C = -1;
        this.D = new HashMap();
        this.E = new SparseArray();
        this.F = new e(this);
        b(attributeSet, i10);
    }
}

package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.h;
import g0.h0;
import g0.i0;
import g0.m;
import g0.y0;
import j6.j;
import j6.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k3.d;
import msr.pistream.app.R;
import p.g;
import p7.a0;
import s5.a;
import w7.b;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int B = 0;
    public HashSet A;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2688c;

    /* renamed from: d, reason: collision with root package name */
    public final g f2689d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f2690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2691f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2692x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2693y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2694z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2686a = new ArrayList();
        this.f2687b = new d(this);
        this.f2688c = new LinkedHashSet();
        this.f2689d = new g(this, 1);
        this.f2691f = false;
        this.A = new HashSet();
        TypedArray N = b.N(getContext(), attributeSet, a.f9909j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(N.getBoolean(3, false));
        this.f2694z = N.getResourceId(1, -1);
        this.f2693y = N.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(N.getBoolean(0, true));
        N.recycle();
        WeakHashMap weakHashMap = y0.f4277a;
        h0.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = y0.f4277a;
            materialButton.setId(i0.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2687b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c6 = c(i10);
            int min = Math.min(c6.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c6.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                m.g(layoutParams, 0);
                m.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                m.h(layoutParams, 0);
            }
            c6.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                m.g(layoutParams3, 0);
                m.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2686a.add(new x5.d(shapeAppearanceModel.f6220e, shapeAppearanceModel.f6223h, shapeAppearanceModel.f6221f, shapeAppearanceModel.f6222g));
        materialButton.setEnabled(isEnabled());
        y0.l(materialButton, new u5.a(this, 1));
    }

    public final void b(int i10, boolean z9) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.A);
        if (z9 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f2692x && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z9 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f2693y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2689d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f2690e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.A;
        this.A = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2691f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2691f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2688c.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z9;
        x5.d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c6 = c(i10);
            if (c6.getVisibility() != 8) {
                k shapeAppearanceModel = c6.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                j jVar = new j(shapeAppearanceModel);
                x5.d dVar2 = (x5.d) this.f2686a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j6.a aVar = x5.d.f11300e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z9) {
                            if (a0.J(this)) {
                                dVar = new x5.d(aVar, aVar, dVar2.f11302b, dVar2.f11303c);
                            } else {
                                dVar = new x5.d(dVar2.f11301a, dVar2.f11304d, aVar, aVar);
                            }
                        } else {
                            dVar = new x5.d(dVar2.f11301a, aVar, dVar2.f11302b, aVar);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z9) {
                            if (a0.J(this)) {
                                dVar = new x5.d(dVar2.f11301a, dVar2.f11304d, aVar, aVar);
                            } else {
                                dVar = new x5.d(aVar, aVar, dVar2.f11302b, dVar2.f11303c);
                            }
                        } else {
                            dVar = new x5.d(aVar, dVar2.f11304d, aVar, dVar2.f11303c);
                        }
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    jVar.f6208e = new j6.a(0.0f);
                    jVar.f6209f = new j6.a(0.0f);
                    jVar.f6210g = new j6.a(0.0f);
                    jVar.f6211h = new j6.a(0.0f);
                } else {
                    jVar.f6208e = dVar2.f11301a;
                    jVar.f6211h = dVar2.f11304d;
                    jVar.f6209f = dVar2.f11302b;
                    jVar.f6210g = dVar2.f11303c;
                }
                c6.setShapeAppearanceModel(new k(jVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f2692x && !this.A.isEmpty()) {
            return ((Integer) this.A.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = c(i10).getId();
            if (this.A.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f2690e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f2694z;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f2692x) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i10));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2686a.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z9);
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f2693y = z9;
    }

    public void setSingleSelection(boolean z9) {
        if (this.f2692x != z9) {
            this.f2692x = z9;
            e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setA11yClassName((this.f2692x ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}

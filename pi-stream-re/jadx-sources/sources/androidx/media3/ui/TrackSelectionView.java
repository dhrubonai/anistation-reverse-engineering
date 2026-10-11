package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import c1.f1;
import c1.g1;
import c1.l1;
import f.b;
import j3.g;
import j3.q0;
import j3.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public q0 A;
    public CheckedTextView[][] B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public final int f1208a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f1209b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckedTextView f1210c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckedTextView f1211d;

    /* renamed from: e, reason: collision with root package name */
    public final b f1212e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1213f;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f1214x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1215y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1216z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f1208a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f1209b = from;
        b bVar = new b(this);
        this.f1212e = bVar;
        this.A = new g(getResources());
        this.f1213f = new ArrayList();
        this.f1214x = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1210c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(msr.pistream.app.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(msr.pistream.app.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1211d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(msr.pistream.app.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z9;
        this.f1210c.setChecked(this.C);
        boolean z10 = this.C;
        HashMap hashMap = this.f1214x;
        if (!z10 && hashMap.size() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f1211d.setChecked(z9);
        for (int i10 = 0; i10 < this.B.length; i10++) {
            g1 g1Var = (g1) hashMap.get(((l1) this.f1213f.get(i10)).f1802b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.B[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (g1Var != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.B[i10][i11].setChecked(g1Var.f1707b.contains(Integer.valueOf(((r0) tag).f6083b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        boolean z9;
        boolean z10;
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f1213f;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f1211d;
        CheckedTextView checkedTextView2 = this.f1210c;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.B = new CheckedTextView[arrayList.size()];
        if (this.f1216z && arrayList.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            l1 l1Var = (l1) arrayList.get(i11);
            if (this.f1215y && l1Var.f1803c) {
                z10 = true;
            } else {
                z10 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.B;
            int i12 = l1Var.f1801a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            r0[] r0VarArr = new r0[i12];
            for (int i13 = 0; i13 < l1Var.f1801a; i13++) {
                r0VarArr[i13] = new r0(l1Var, i13);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                LayoutInflater layoutInflater = this.f1209b;
                if (i14 == 0) {
                    addView(layoutInflater.inflate(msr.pistream.app.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z10 && !z9) {
                    i10 = R.layout.simple_list_item_single_choice;
                } else {
                    i10 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i10, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f1208a);
                q0 q0Var = this.A;
                r0 r0Var = r0VarArr[i14];
                checkedTextView3.setText(((g) q0Var).d(r0Var.f6082a.b(r0Var.f6083b)));
                checkedTextView3.setTag(r0VarArr[i14]);
                if (l1Var.g(i14)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f1212e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.B[i11][i14] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.C;
    }

    public Map<f1, g1> getOverrides() {
        return this.f1214x;
    }

    public void setAllowAdaptiveSelections(boolean z9) {
        if (this.f1215y != z9) {
            this.f1215y = z9;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z9) {
        if (this.f1216z != z9) {
            this.f1216z = z9;
            if (!z9) {
                HashMap hashMap = this.f1214x;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f1213f;
                    HashMap hashMap2 = new HashMap();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        g1 g1Var = (g1) hashMap.get(((l1) arrayList.get(i10)).f1802b);
                        if (g1Var != null && hashMap2.isEmpty()) {
                            hashMap2.put(g1Var.f1706a, g1Var);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z9) {
        int i10;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1210c.setVisibility(i10);
    }

    public void setTrackNameProvider(q0 q0Var) {
        q0Var.getClass();
        this.A = q0Var;
        b();
    }
}

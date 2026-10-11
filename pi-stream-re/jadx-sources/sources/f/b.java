package f;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c4;
import androidx.media3.ui.TrackSelectionView;
import c1.f1;
import c1.g1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3629b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3628a = i10;
        this.f3629b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Object[] objArr;
        Object[] objArr2;
        Message message4 = null;
        j.q qVar = null;
        message4 = null;
        int i10 = this.f3628a;
        boolean z9 = true;
        Object obj = this.f3629b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                if (view == hVar.f3713j && (message3 = hVar.f3715l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == hVar.f3717n && (message2 = hVar.f3718p) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == hVar.f3720r && (message = hVar.f3722t) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                hVar.J.obtainMessage(1, hVar.f3705b).sendToTarget();
                return;
            case 1:
                c4 c4Var = ((Toolbar) obj).f386f0;
                if (c4Var != null) {
                    qVar = c4Var.f436b;
                }
                if (qVar != null) {
                    qVar.collapseActionView();
                    return;
                }
                return;
            case 2:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                CheckedTextView checkedTextView = trackSelectionView.f1210c;
                HashMap hashMap = trackSelectionView.f1214x;
                if (view == checkedTextView) {
                    trackSelectionView.C = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f1211d) {
                    trackSelectionView.C = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.C = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    j3.r0 r0Var = (j3.r0) tag;
                    f1 f1Var = r0Var.f6082a.f1802b;
                    g1 g1Var = (g1) hashMap.get(f1Var);
                    int i11 = r0Var.f6083b;
                    if (g1Var == null) {
                        if (!trackSelectionView.f1216z && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(f1Var, new g1(f1Var, r6.o0.o(Integer.valueOf(i11))));
                    } else {
                        ArrayList arrayList = new ArrayList(g1Var.f1707b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.f1215y && r0Var.f6082a.f1803c) {
                            objArr = true;
                        } else {
                            objArr = false;
                        }
                        if (objArr == false) {
                            if (trackSelectionView.f1216z && trackSelectionView.f1213f.size() > 1) {
                                objArr2 = true;
                            } else {
                                objArr2 = false;
                            }
                            if (objArr2 == false) {
                                z9 = false;
                            }
                        }
                        if (isChecked && z9) {
                            arrayList.remove(Integer.valueOf(i11));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(f1Var);
                            } else {
                                hashMap.put(f1Var, new g1(f1Var, arrayList));
                            }
                        } else if (!isChecked) {
                            if (objArr != false) {
                                arrayList.add(Integer.valueOf(i11));
                                hashMap.put(f1Var, new g1(f1Var, arrayList));
                            } else {
                                hashMap.put(f1Var, new g1(f1Var, r6.o0.o(Integer.valueOf(i11))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            default:
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) obj;
                int i12 = kVar.f2734q0;
                if (i12 == 2) {
                    kVar.V(1);
                    return;
                } else {
                    if (i12 == 1) {
                        kVar.V(2);
                        return;
                    }
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TrackSelectionView trackSelectionView) {
        this(trackSelectionView, 2);
        this.f3628a = 2;
    }
}

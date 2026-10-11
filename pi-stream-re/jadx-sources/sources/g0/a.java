package g0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final c f4164a;

    public a(c cVar) {
        this.f4164a = cVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4164a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        androidx.fragment.app.o b10 = this.f4164a.b(view);
        if (b10 != null) {
            return (AccessibilityNodeProvider) b10.f947a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4164a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        boolean z10;
        ClickableSpan[] clickableSpanArr;
        int i10;
        h0.h hVar = new h0.h(accessibilityNodeInfo);
        WeakHashMap weakHashMap = y0.f4277a;
        int i11 = 0;
        Boolean bool = (Boolean) new d0(R.id.tag_screen_reader_focusable, 0).b(view);
        boolean z11 = true;
        if (bool != null && bool.booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z9);
        } else {
            hVar.f(1, z9);
        }
        Boolean bool2 = (Boolean) new d0(R.id.tag_accessibility_heading, 3).b(view);
        if (bool2 != null && bool2.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = 2;
        if (i12 >= 28) {
            accessibilityNodeInfo.setHeading(z10);
        } else {
            hVar.f(2, z10);
        }
        CharSequence d10 = y0.d(view);
        if (i12 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d10);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d10);
        }
        CharSequence charSequence = (CharSequence) new d0(R.id.tag_state_description, 64, 30, i13).b(view);
        if (i12 < 30) {
            z11 = false;
        }
        if (z11) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f4164a.d(view, hVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i12 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    if (((WeakReference) sparseArray.valueAt(i14)).get() == null) {
                        arrayList.add(Integer.valueOf(i14));
                    }
                }
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    sparseArray.remove(((Integer) arrayList.get(i15)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                hVar.f4539a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i16 = 0;
                while (i16 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i16];
                    int i17 = i11;
                    while (true) {
                        if (i17 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i17)).get())) {
                                i10 = sparseArray2.keyAt(i17);
                                break;
                            }
                            i17++;
                        } else {
                            i10 = h0.h.f4538d;
                            h0.h.f4538d = i10 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i10, new WeakReference(clickableSpanArr[i16]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i16];
                    Spanned spanned = (Spanned) text;
                    hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    i16++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            hVar.b((h0.g) list.get(i18));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4164a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4164a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f4164a.g(view, i10, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f4164a.h(view, i10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f4164a.i(view, accessibilityEvent);
    }
}

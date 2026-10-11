package u5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import h0.h;

/* loaded from: classes.dex */
public final class a extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10276e;

    public /* synthetic */ a(Object obj, int i10) {
        this.f10275d = i10;
        this.f10276e = obj;
    }

    @Override // g0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10275d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10276e).isChecked());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // g0.c
    public final void d(View view, h hVar) {
        int i10;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        int i11 = this.f10275d;
        Object obj = this.f10276e;
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        switch (i11) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.B;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    i10 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) != view) {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.d(i13)) {
                                i10++;
                            }
                        } else {
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
                            return;
                        }
                    }
                }
                i10 = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2772e);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).O);
                return;
        }
    }
}

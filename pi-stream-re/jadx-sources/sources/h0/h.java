package h0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static int f4538d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f4539a;

    /* renamed from: b, reason: collision with root package name */
    public int f4540b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f4541c = -1;

    public h(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4539a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f4539a.addAction(i10);
    }

    public final void b(g gVar) {
        this.f4539a.addAction((AccessibilityNodeInfo.AccessibilityAction) gVar.f4534a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4539a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void d(Rect rect) {
        this.f4539a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        boolean z9 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4539a;
        if (z9) {
            ArrayList c6 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i10 = 0; i10 < c6.size(); i10++) {
                spannableString.setSpan(new a(((Integer) c12.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c6.get(i10)).intValue(), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f4539a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.f4541c == hVar.f4541c && this.f4540b == hVar.f4540b) {
            return true;
        }
        return false;
    }

    public final void f(int i10, boolean z9) {
        Bundle extras = this.f4539a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z9) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public final void g(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4539a;
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void h(CharSequence charSequence) {
        this.f4539a.setText(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4539a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4539a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (com.bumptech.glide.d.G()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new g(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            g gVar = (g) emptyList.get(i11);
            int a10 = gVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case R.id.accessibilityActionMoveWindow:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case R.id.accessibilityActionShowOnScreen:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case R.id.accessibilityActionScrollToPosition:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case R.id.accessibilityActionScrollUp:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case R.id.accessibilityActionScrollLeft:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case R.id.accessibilityActionScrollDown:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case R.id.accessibilityActionScrollRight:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case R.id.accessibilityActionContextClick:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case R.id.accessibilityActionSetProgress:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case R.id.accessibilityActionShowTooltip:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionHideTooltip:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case R.id.accessibilityActionPageUp:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case R.id.accessibilityActionPageDown:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case R.id.accessibilityActionPageLeft:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case R.id.accessibilityActionPageRight:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case R.id.accessibilityActionPressAndHold:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case R.id.accessibilityActionImeEnter:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case R.id.ALT:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case R.id.CTRL:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case R.id.FUNCTION:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN")) {
                Object obj = gVar.f4534a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    str = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(str);
            if (i11 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

package h1;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements q6.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4624a;

    @Override // q6.h
    public final boolean apply(Object obj) {
        switch (this.f4624a) {
            case 0:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            case 1:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            case 2:
                return !(obj instanceof e1.f);
            default:
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    return false;
                }
                return true;
        }
    }
}

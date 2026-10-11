package t4;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import java.util.Arrays;
import java.util.Set;
import p7.a0;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f10032b = new d(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10033a;

    public /* synthetic */ d(Bundle bundle) {
        this.f10033a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Bundle bundle = ((d) obj).f10033a;
        Bundle bundle2 = this.f10033a;
        if (bundle2 != null && bundle != null) {
            if (bundle2.size() == bundle.size()) {
                Set<String> keySet = bundle2.keySet();
                if (keySet.containsAll(bundle.keySet())) {
                    for (String str : keySet) {
                        if (!a0.q(bundle2.get(str), bundle.get(str))) {
                        }
                    }
                    return true;
                }
            }
        } else if (bundle2 == bundle) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10033a});
    }
}

package q5;

import com.google.android.gms.common.api.e;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9200a = new a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        if (a0.q(null, null) && a0.q(null, null) && a0.q(null, null) && a0.q(null, null) && a0.q(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}

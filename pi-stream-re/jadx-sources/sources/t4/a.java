package t4;

import com.google.android.gms.common.api.e;
import java.util.Arrays;
import p7.a0;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f10026c = new a(new z3.e(9));

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10027a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10028b;

    public a(z3.e eVar) {
        this.f10027a = ((Boolean) eVar.f12044b).booleanValue();
        this.f10028b = (String) eVar.f12045c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (a0.q(null, null) && this.f10027a == aVar.f10027a && a0.q(this.f10028b, aVar.f10028b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f10027a), this.f10028b});
    }
}

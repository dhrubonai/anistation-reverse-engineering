package z4;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Status f12055a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f12056b;

    public a(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f12056b = googleSignInAccount;
        this.f12055a = status;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f12055a;
    }
}

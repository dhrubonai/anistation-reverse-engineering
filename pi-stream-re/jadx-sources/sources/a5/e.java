package a5;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class e extends a1.b {

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f101j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f102k;

    public e(SignInHubActivity signInHubActivity, Set set) {
        super(signInHubActivity);
        this.f101j = new Semaphore(0);
        this.f102k = set;
    }
}

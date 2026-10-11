package com.google.firebase.auth;

import c5.a;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiFactorResolver extends a {
    public abstract FirebaseAuth getFirebaseAuth();

    public abstract List<MultiFactorInfo> getHints();

    public abstract MultiFactorSession getSession();

    public abstract Task<AuthResult> resolveSignIn(MultiFactorAssertion multiFactorAssertion);
}

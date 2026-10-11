package com.google.android.recaptcha.internal;

import a3.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlz extends IllegalArgumentException {
    public zzlz(int i10, int i11) {
        super(g.p("Unpaired surrogate at index ", i10, " of ", i11));
    }
}

package com.google.android.gms.internal.auth;

import android.util.Log;
import g5.d;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class zzbz extends d {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("AUTH", "Error serializing object.", e10);
            return null;
        }
    }
}

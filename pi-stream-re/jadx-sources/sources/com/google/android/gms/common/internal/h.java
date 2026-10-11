package com.google.android.gms.common.internal;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Account f2521a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2522b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2523c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2524d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2525e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2526f;

    /* renamed from: g, reason: collision with root package name */
    public final q5.a f2527g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f2528h;

    public h(Account account, n.f fVar, String str, String str2) {
        Set unmodifiableSet;
        q5.a aVar = q5.a.f9200a;
        this.f2521a = account;
        if (fVar == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(fVar);
        }
        this.f2522b = unmodifiableSet;
        Map emptyMap = Collections.emptyMap();
        this.f2524d = emptyMap;
        this.f2525e = str;
        this.f2526f = str2;
        this.f2527g = aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f2523c = Collections.unmodifiableSet(hashSet);
        } else {
            a3.g.z(it.next());
            throw null;
        }
    }
}

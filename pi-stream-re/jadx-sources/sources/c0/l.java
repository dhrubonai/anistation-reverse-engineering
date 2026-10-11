package c0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f1612a;

    public l(Object obj) {
        this.f1612a = a6.a.h(obj);
    }

    @Override // c0.k
    public final String a() {
        String languageTags;
        languageTags = this.f1612a.toLanguageTags();
        return languageTags;
    }

    @Override // c0.k
    public final Object b() {
        return this.f1612a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f1612a.equals(((k) obj).b());
        return equals;
    }

    @Override // c0.k
    public final Locale get(int i10) {
        Locale locale;
        locale = this.f1612a.get(i10);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f1612a.hashCode();
        return hashCode;
    }

    @Override // c0.k
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f1612a.isEmpty();
        return isEmpty;
    }

    @Override // c0.k
    public final int size() {
        int size;
        size = this.f1612a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f1612a.toString();
        return localeList;
    }
}

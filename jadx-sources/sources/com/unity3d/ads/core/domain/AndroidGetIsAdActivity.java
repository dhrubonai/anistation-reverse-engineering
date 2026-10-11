package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import defpackage.d46;
import defpackage.r18;
import defpackage.rb3;
import defpackage.y7;
import defpackage.zd0;
import defpackage.zo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidGetIsAdActivity {
    private final rb3 activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
        this.activities$delegate = new d46(new y7(this, (byte) 10));
    }

    public static final List activities_delegate$lambda$1(AndroidGetIsAdActivity androidGetIsAdActivity) {
        List<ByteString> observableAndroidActivitiesList = androidGetIsAdActivity.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        observableAndroidActivitiesList.getClass();
        ArrayList arrayList = new ArrayList(zo0.V(observableAndroidActivitiesList, 10));
        Iterator<T> it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
            arrayList.add(new zd0(Arrays.copyOf(copyOf, copyOf.length)));
        }
        return arrayList;
    }

    private final List<zd0> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String str) {
        str.getClass();
        String sHA256Hash = StringExtensionsKt.getSHA256Hash(str);
        zd0 zd0Var = zd0.A;
        return getActivities().contains(r18.g(sHA256Hash));
    }
}

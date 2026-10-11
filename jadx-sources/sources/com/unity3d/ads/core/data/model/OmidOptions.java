package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.jh4;
import defpackage.k21;
import defpackage.kx2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OmidOptions {
    private final k21 creativeType;
    private final String customReferenceData;
    private final jh4 impressionOwner;
    private final kx2 impressionType;
    private final boolean isolateVerificationScripts;
    private final jh4 mediaEventsOwner;
    private final jh4 videoEventsOwner;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ OmidOptions(boolean r2, defpackage.jh4 r3, defpackage.jh4 r4, java.lang.String r5, defpackage.kx2 r6, defpackage.k21 r7, defpackage.jh4 r8, int r9, defpackage.q71 r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 8
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 16
            if (r10 == 0) goto L1a
            r6 = r0
        L1a:
            r10 = r9 & 32
            if (r10 == 0) goto L1f
            r7 = r0
        L1f:
            r9 = r9 & 64
            if (r9 == 0) goto L2c
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L34
        L2c:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.OmidOptions.<init>(boolean, jh4, jh4, java.lang.String, kx2, k21, jh4, int, q71):void");
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, jh4 jh4Var, jh4 jh4Var2, String str, kx2 kx2Var, k21 k21Var, jh4 jh4Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            jh4Var = omidOptions.impressionOwner;
        }
        if ((i & 4) != 0) {
            jh4Var2 = omidOptions.videoEventsOwner;
        }
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        if ((i & 16) != 0) {
            kx2Var = omidOptions.impressionType;
        }
        if ((i & 32) != 0) {
            k21Var = omidOptions.creativeType;
        }
        if ((i & 64) != 0) {
            jh4Var3 = omidOptions.mediaEventsOwner;
        }
        k21 k21Var2 = k21Var;
        jh4 jh4Var4 = jh4Var3;
        kx2 kx2Var2 = kx2Var;
        jh4 jh4Var5 = jh4Var2;
        return omidOptions.copy(z, jh4Var, jh4Var5, str, kx2Var2, k21Var2, jh4Var4);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final jh4 component2() {
        return this.impressionOwner;
    }

    public final jh4 component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final kx2 component5() {
        return this.impressionType;
    }

    public final k21 component6() {
        return this.creativeType;
    }

    public final jh4 component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z, jh4 jh4Var, jh4 jh4Var2, String str, kx2 kx2Var, k21 k21Var, jh4 jh4Var3) {
        return new OmidOptions(z, jh4Var, jh4Var2, str, kx2Var, k21Var, jh4Var3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        if (this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && a34.i(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner) {
            return true;
        }
        return false;
    }

    public final k21 getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final jh4 getImpressionOwner() {
        return this.impressionOwner;
    }

    public final kx2 getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final jh4 getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final jh4 getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = Boolean.hashCode(this.isolateVerificationScripts) * 31;
        jh4 jh4Var = this.impressionOwner;
        int i = 0;
        if (jh4Var == null) {
            hashCode = 0;
        } else {
            hashCode = jh4Var.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        jh4 jh4Var2 = this.videoEventsOwner;
        if (jh4Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jh4Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.customReferenceData;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        kx2 kx2Var = this.impressionType;
        if (kx2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = kx2Var.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        k21 k21Var = this.creativeType;
        if (k21Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = k21Var.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        jh4 jh4Var3 = this.mediaEventsOwner;
        if (jh4Var3 != null) {
            i = jh4Var3.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z, jh4 jh4Var, jh4 jh4Var2, String str, kx2 kx2Var, k21 k21Var, jh4 jh4Var3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = jh4Var;
        this.videoEventsOwner = jh4Var2;
        this.customReferenceData = str;
        this.impressionType = kx2Var;
        this.creativeType = k21Var;
        this.mediaEventsOwner = jh4Var3;
    }

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }
}

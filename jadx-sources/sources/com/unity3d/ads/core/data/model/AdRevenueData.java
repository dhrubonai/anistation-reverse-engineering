package com.unity3d.ads.core.data.model;

import defpackage.a34;
import defpackage.q71;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AdRevenueData {
    private final AdRevenueAdFormat adFormat;
    private final String adUnitId;
    private final String countryCode;
    private final UUID eventId;
    private final String networkName;
    private final Double revenue;
    private final String thirdPartyAdPlacementId;

    public AdRevenueData(UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat) {
        uuid.getClass();
        this.eventId = uuid;
        this.revenue = d;
        this.countryCode = str;
        this.networkName = str2;
        this.adUnitId = str3;
        this.thirdPartyAdPlacementId = str4;
        this.adFormat = adRevenueAdFormat;
    }

    public static /* synthetic */ AdRevenueData copy$default(AdRevenueData adRevenueData, UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = adRevenueData.eventId;
        }
        if ((i & 2) != 0) {
            d = adRevenueData.revenue;
        }
        if ((i & 4) != 0) {
            str = adRevenueData.countryCode;
        }
        if ((i & 8) != 0) {
            str2 = adRevenueData.networkName;
        }
        if ((i & 16) != 0) {
            str3 = adRevenueData.adUnitId;
        }
        if ((i & 32) != 0) {
            str4 = adRevenueData.thirdPartyAdPlacementId;
        }
        if ((i & 64) != 0) {
            adRevenueAdFormat = adRevenueData.adFormat;
        }
        String str5 = str4;
        AdRevenueAdFormat adRevenueAdFormat2 = adRevenueAdFormat;
        String str6 = str3;
        String str7 = str;
        return adRevenueData.copy(uuid, d, str7, str2, str6, str5, adRevenueAdFormat2);
    }

    public final UUID component1() {
        return this.eventId;
    }

    public final Double component2() {
        return this.revenue;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final String component4() {
        return this.networkName;
    }

    public final String component5() {
        return this.adUnitId;
    }

    public final String component6() {
        return this.thirdPartyAdPlacementId;
    }

    public final AdRevenueAdFormat component7() {
        return this.adFormat;
    }

    public final AdRevenueData copy(UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat) {
        uuid.getClass();
        return new AdRevenueData(uuid, d, str, str2, str3, str4, adRevenueAdFormat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) obj;
        if (a34.i(this.eventId, adRevenueData.eventId) && a34.i(this.revenue, adRevenueData.revenue) && a34.i(this.countryCode, adRevenueData.countryCode) && a34.i(this.networkName, adRevenueData.networkName) && a34.i(this.adUnitId, adRevenueData.adUnitId) && a34.i(this.thirdPartyAdPlacementId, adRevenueData.thirdPartyAdPlacementId) && this.adFormat == adRevenueData.adFormat) {
            return true;
        }
        return false;
    }

    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.eventId.hashCode() * 31;
        Double d = this.revenue;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str = this.countryCode;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.networkName;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.adUnitId;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.thirdPartyAdPlacementId;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        AdRevenueAdFormat adRevenueAdFormat = this.adFormat;
        if (adRevenueAdFormat != null) {
            i = adRevenueAdFormat.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        return "AdRevenueData(eventId=" + this.eventId + ", revenue=" + this.revenue + ", countryCode=" + this.countryCode + ", networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", thirdPartyAdPlacementId=" + this.thirdPartyAdPlacementId + ", adFormat=" + this.adFormat + ')';
    }

    public /* synthetic */ AdRevenueData(UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, q71 q71Var) {
        this((i & 1) != 0 ? UUID.randomUUID() : uuid, d, str, str2, str3, str4, adRevenueAdFormat);
    }
}

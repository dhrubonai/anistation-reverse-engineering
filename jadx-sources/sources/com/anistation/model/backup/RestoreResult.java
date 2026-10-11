package com.anistation.model.backup;

import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class RestoreResult {
    private final int animeCount;
    private final long backupCreatedAtEpochMillis;
    private final BackupFrequency backupFrequency;
    private final int removedHistoryCount;
    private final int watchProgressCount;

    public RestoreResult(int i, int i2, int i3, long j, BackupFrequency backupFrequency) {
        backupFrequency.getClass();
        this.animeCount = i;
        this.watchProgressCount = i2;
        this.removedHistoryCount = i3;
        this.backupCreatedAtEpochMillis = j;
        this.backupFrequency = backupFrequency;
    }

    public static /* synthetic */ RestoreResult copy$default(RestoreResult restoreResult, int i, int i2, int i3, long j, BackupFrequency backupFrequency, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = restoreResult.animeCount;
        }
        if ((i4 & 2) != 0) {
            i2 = restoreResult.watchProgressCount;
        }
        if ((i4 & 4) != 0) {
            i3 = restoreResult.removedHistoryCount;
        }
        if ((i4 & 8) != 0) {
            j = restoreResult.backupCreatedAtEpochMillis;
        }
        if ((i4 & 16) != 0) {
            backupFrequency = restoreResult.backupFrequency;
        }
        BackupFrequency backupFrequency2 = backupFrequency;
        int i5 = i3;
        return restoreResult.copy(i, i2, i5, j, backupFrequency2);
    }

    public final int component1() {
        return this.animeCount;
    }

    public final int component2() {
        return this.watchProgressCount;
    }

    public final int component3() {
        return this.removedHistoryCount;
    }

    public final long component4() {
        return this.backupCreatedAtEpochMillis;
    }

    public final BackupFrequency component5() {
        return this.backupFrequency;
    }

    public final RestoreResult copy(int i, int i2, int i3, long j, BackupFrequency backupFrequency) {
        backupFrequency.getClass();
        return new RestoreResult(i, i2, i3, j, backupFrequency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestoreResult)) {
            return false;
        }
        RestoreResult restoreResult = (RestoreResult) obj;
        if (this.animeCount == restoreResult.animeCount && this.watchProgressCount == restoreResult.watchProgressCount && this.removedHistoryCount == restoreResult.removedHistoryCount && this.backupCreatedAtEpochMillis == restoreResult.backupCreatedAtEpochMillis && this.backupFrequency == restoreResult.backupFrequency) {
            return true;
        }
        return false;
    }

    public final int getAnimeCount() {
        return this.animeCount;
    }

    public final long getBackupCreatedAtEpochMillis() {
        return this.backupCreatedAtEpochMillis;
    }

    public final BackupFrequency getBackupFrequency() {
        return this.backupFrequency;
    }

    public final int getRemovedHistoryCount() {
        return this.removedHistoryCount;
    }

    public final int getWatchProgressCount() {
        return this.watchProgressCount;
    }

    public int hashCode() {
        return this.backupFrequency.hashCode() + qx1.d(qx1.c(this.removedHistoryCount, qx1.c(this.watchProgressCount, Integer.hashCode(this.animeCount) * 31, 31), 31), this.backupCreatedAtEpochMillis, 31);
    }

    public String toString() {
        int i = this.animeCount;
        int i2 = this.watchProgressCount;
        int i3 = this.removedHistoryCount;
        long j = this.backupCreatedAtEpochMillis;
        BackupFrequency backupFrequency = this.backupFrequency;
        StringBuilder u = qx1.u("RestoreResult(animeCount=", i, ", watchProgressCount=", i2, ", removedHistoryCount=");
        u.append(i3);
        u.append(", backupCreatedAtEpochMillis=");
        u.append(j);
        u.append(", backupFrequency=");
        u.append(backupFrequency);
        u.append(")");
        return u.toString();
    }
}

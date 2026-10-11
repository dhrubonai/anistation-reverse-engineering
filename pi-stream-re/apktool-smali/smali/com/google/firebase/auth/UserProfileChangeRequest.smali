.class public Lcom/google/firebase/auth/UserProfileChangeRequest;
.super Lc5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/UserProfileChangeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Z

.field private zzd:Z

.field private zze:Landroid/net/Uri;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/auth/zzav;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/firebase/auth/zzav;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/auth/UserProfileChangeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzc:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzd:Z

    .line 11
    .line 12
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    iput-object p1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zze:Landroid/net/Uri;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zza:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPhotoUri()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zze:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-virtual {p0}, Lcom/google/firebase/auth/UserProfileChangeRequest;->getDisplayName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    iget-object v1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzb:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    iget-boolean v1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzc:Z

    .line 24
    .line 25
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    iget-boolean v1, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzd:Z

    .line 30
    .line 31
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzb()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzc:Z

    .line 2
    .line 3
    return v0
.end method

.method public final zzc()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/auth/UserProfileChangeRequest;->zzd:Z

    .line 2
    .line 3
    return v0
.end method

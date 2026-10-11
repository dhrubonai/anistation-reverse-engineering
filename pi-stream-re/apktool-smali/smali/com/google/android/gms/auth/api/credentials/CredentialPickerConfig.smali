.class public final Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;
.super Lc5/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv4/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv4/b;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->a:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->b:Z

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->c:Z

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ge p1, p3, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    if-eq p1, p5, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x3

    .line 18
    :goto_0
    iput p1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->d:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iput p2, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->d:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
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
    const/4 v0, 0x1

    .line 8
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->b:Z

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-boolean v2, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->c:Z

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 17
    .line 18
    .line 19
    iget v1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->d:I

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-static {p1, v2, v0}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    const/16 v0, 0x3e8

    .line 34
    .line 35
    iget v1, p0, Lcom/google/android/gms/auth/api/credentials/CredentialPickerConfig;->a:I

    .line 36
    .line 37
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

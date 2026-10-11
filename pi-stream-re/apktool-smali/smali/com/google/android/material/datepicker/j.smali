.class public final Lcom/google/android/material/datepicker/j;
.super Lm3/o0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/t;

.field public final synthetic b:Lcom/google/android/material/button/MaterialButton;

.field public final synthetic c:Lcom/google/android/material/datepicker/k;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/t;Lcom/google/android/material/button/MaterialButton;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/j;->c:Lcom/google/android/material/datepicker/k;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/material/datepicker/j;->a:Lcom/google/android/material/datepicker/t;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/material/datepicker/j;->b:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    invoke-direct {p0}, Lm3/o0;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/google/android/material/datepicker/j;->b:Lcom/google/android/material/button/MaterialButton;

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/j;->c:Lcom/google/android/material/datepicker/k;

    .line 2
    .line 3
    if-gez p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p1, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lm3/k0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p2, p1, Lcom/google/android/material/datepicker/k;->t0:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lm3/k0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    :goto_0
    iget-object p3, p0, Lcom/google/android/material/datepicker/j;->a:Lcom/google/android/material/datepicker/t;

    .line 31
    .line 32
    iget-object v0, p3, Lcom/google/android/material/datepicker/t;->d:Lcom/google/android/material/datepicker/c;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/google/android/material/datepicker/p;->a:Ljava/util/Calendar;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x2

    .line 43
    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->add(II)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lcom/google/android/material/datepicker/p;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Lcom/google/android/material/datepicker/p;-><init>(Ljava/util/Calendar;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p1, Lcom/google/android/material/datepicker/k;->p0:Lcom/google/android/material/datepicker/p;

    .line 52
    .line 53
    iget-object p1, p3, Lcom/google/android/material/datepicker/t;->d:Lcom/google/android/material/datepicker/c;

    .line 54
    .line 55
    iget-object p1, p1, Lcom/google/android/material/datepicker/c;->a:Lcom/google/android/material/datepicker/p;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/google/android/material/datepicker/p;->a:Ljava/util/Calendar;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1, v1, p2}, Ljava/util/Calendar;->add(II)V

    .line 64
    .line 65
    .line 66
    const/4 p2, 0x5

    .line 67
    const/4 p3, 0x1

    .line 68
    invoke-virtual {p1, p2, p3}, Ljava/util/Calendar;->set(II)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lcom/google/android/material/datepicker/w;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p3}, Ljava/util/Calendar;->get(I)I

    .line 79
    .line 80
    .line 81
    const/4 p3, 0x7

    .line 82
    invoke-virtual {p1, p3}, Ljava/util/Calendar;->getMaximum(I)I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const/16 v0, 0x18

    .line 98
    .line 99
    if-lt p3, v0, :cond_1

    .line 100
    .line 101
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    const-string v0, "yMMMM"

    .line 106
    .line 107
    invoke-static {v0, p3}, Lcom/google/android/material/datepicker/w;->a(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    new-instance v0, Ljava/util/Date;

    .line 112
    .line 113
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 114
    .line 115
    .line 116
    invoke-static {p3, v0}, La6/a;->l(Landroid/icu/text/DateFormat;Ljava/util/Date;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    const/16 p3, 0x2024

    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    invoke-static {v0, p1, p2, p3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_1
    iget-object p2, p0, Lcom/google/android/material/datepicker/j;->b:Lcom/google/android/material/button/MaterialButton;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

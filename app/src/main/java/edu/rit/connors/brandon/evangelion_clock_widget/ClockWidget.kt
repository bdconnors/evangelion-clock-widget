package edu.rit.connors.brandon.evangelion_clock_widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.widget.RemoteViews
import java.util.*

// Implementation of App Widget functionality.
class ClockWidget : AppWidgetProvider() {

    override fun onUpdate(
            context: Context,
            appWidgetManager: AppWidgetManager,
            appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    // Enter relevant functionality for
    // when the first widget is created
    override fun onEnabled(context: Context) {

    }

    // Enter relevant functionality for
    // when the last widget is disabled
    override fun onDisabled(context: Context) {

    }

    override fun onReceive(context: Context?, intent: Intent?) {
        val views = RemoteViews(context?.packageName, R.layout.clock_widget)
        /**val calendar = Calendar.getInstance()
        val hour12hrs = calendar[Calendar.HOUR].toString()
        val minutes = calendar[Calendar.MINUTE].toString()
        val seconds = calendar[Calendar.SECOND].toString()
        val time = "$hour12hrs:$minutes:$seconds"
        val timeDisplayValue = SpannableString(time)
        timeDisplayValue.setSpan(RelativeSizeSpan(12f),6,7,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        views.setTextViewText(R.layout.clock_widget,timeDisplayValue)**/
        super.onReceive(context, intent)
    }

}

internal fun updateAppWidget(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int
) {
    // Construct the RemoteViews object
    val views = RemoteViews(context.packageName, R.layout.clock_widget)
    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}

// lib/ar_scanner_plugin.dart
import 'package:flutter/services.dart';

class ArScannerPlugin {
  static const MethodChannel _channel = MethodChannel('ar_scanner_plugin');

  static Future<Map<String, dynamic>> startScan() async {
    try {
      final result = await _channel.invokeMethod('startScan');
      return Map<String, dynamic>.from(result);
    } on PlatformException catch (e) {
      throw "Failed to start scan: ${e.message}";
    }
  }
}

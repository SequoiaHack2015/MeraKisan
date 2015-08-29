package com.sequoia.merakisan.processor;

import java.util.Collection;

import com.sequoia.merakisan.recommended.items.CropIf;
import com.sequoia.merakisan.requests.ProcessorRequestIf;

public interface ProcessorIf {

	Collection<CropIf> executeProcessor(ProcessorRequestIf request);
}
